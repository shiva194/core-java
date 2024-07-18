import java.util.*;

class Bar{

static String wineBrandsName[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addWineBrandsName(String wineName){

	boolean isWineNameAdded=false;
	
	if(index<wineBrandsName.length){
    if(wineName!=null){
	 wineBrandsName[index]=wineName;
	 index++;
	 isWineNameAdded=true;
		}
	else{
	System.out.println("enter a valid WineBrandName");
		}
	} 
	else{
	System.out.println("wine Brands Name list is full");
	}
	return isWineNameAdded;
}

public static void getAllBrands(){
	
	for(String wine:wineBrandsName){
		System.out.println(wine);
		}
	}
	
	
	public static boolean updateWineBrands(String oldBrandName, String newBrandName){
		boolean isWineNameUpdated=false;
	 for(int wineList=0;wineList<wineBrandsName.length;wineList++){
		if(oldBrandName==wineBrandsName[wineList]){
			wineBrandsName[wineList]=newBrandName;
			isWineNameUpdated=true;
			}
		}
		return isWineNameUpdated;
	}
	
	public static boolean deletBrandName(String oldBrand){
		boolean isBrandNameDeletd=false;
		int newIndex;
		int oldIndex;
		if(oldBrand!=null){
			for(newIndex=0,oldIndex=0;oldIndex<wineBrandsName.length;oldIndex++){
				if(oldBrand!=wineBrandsName[oldIndex]){
					wineBrandsName[newIndex]=wineBrandsName[oldIndex];
					newIndex++;
				}
			}
			wineBrandsName=Arrays.copyOf(wineBrandsName,newIndex);
			isBrandNameDeletd=true;
		}
		return isBrandNameDeletd;
	}
}