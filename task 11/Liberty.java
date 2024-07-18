import java.util.*;

class Liberty{

static String brandsName[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addShoeBrandsName(String brandName){

	boolean isBrandsNameAdded=false;
	
	if(index<brandsName.length){
    if(brandName!=null){
	 brandsName[index]=brandName;
	 index++;
	 isBrandsNameAdded=true;
		}
	else{
	System.out.println("enter a valid BrandName");
		}
	} 
	else{
	System.out.println("wine Brands Name list is full");
	}
	return isBrandsNameAdded;
}

public static void getAllBrands(){
	
	for(String brands:brandsName){
		System.out.println(brands);
		}
	}
	
	
	public static boolean updateShoeBrands(String oldBrandName, String newBrandName){
		boolean isBrandsNameUpdated=false;
	 for(int brandsList=0;brandsList<brandsName.length;brandsList++){
		if(oldBrandName==brandsName[brandsList]){
			brandsName[brandsList]=newBrandName;
			isBrandsNameUpdated=true;
			}
		}
		return isBrandsNameUpdated;
	}
	
	public static boolean deletBrandName(String oldBrand){
		boolean isBrandNameDeletd=false;
		int newIndex;
		int oldIndex;
		if(oldBrand!=null){
			for(newIndex=0,oldIndex=0;oldIndex<brandsName.length;oldIndex++){
				if(oldBrand!=brandsName[oldIndex]){
					brandsName[newIndex]=brandsName[oldIndex];
					newIndex++;
				}
			}
			brandsName=Arrays.copyOf(brandsName,newIndex);
			isBrandNameDeletd=true;
		}
		return isBrandNameDeletd;
	}
}