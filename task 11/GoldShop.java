import java.util.*;

class GoldShop{


static String goldNames[]={null,null,null,null,null,null,null};
static int index;

public static boolean addGoldItem(String goldName){
	boolean isgoldName=false;
	if(index<goldNames.length){
	if(goldName!=null){
		goldNames[index]=goldName;
		isgoldName=true;
		index++;
		}
		else{
		System.out.println("enter a valid name");
		}
	}
		else{
			System.out.println("gold name list is full");
		}
		return isgoldName;
	}
	
	public static void getAllGoldItems(){
	
	for(String name:goldNames){
		System.out.println(name);
		}
	}	
	
	
	public static boolean updateGoldItems(String oldGoldItem, String newGoldItem){
	
       boolean isupdateGoldItems=false;
	   for(int goldIndex=0;goldIndex<goldNames.length;goldIndex++){
	   if(oldGoldItem==goldNames[goldIndex]){
		 goldNames[goldIndex]=newGoldItem;
		isupdateGoldItems=true;		 
		}
	   }
	return isupdateGoldItems;	   
	}
	
	
	public static boolean deleteGoldItems(String oldName){
			boolean isGoldNameDeleted=false;
      

if(oldName!=null){
	int newIndex,oldIndex;
	for(newIndex=0,oldIndex=0;oldIndex<goldNames.length;oldIndex++){
		
		if(oldName!=goldNames[oldIndex]){
			  
			  goldNames[newIndex]=goldNames[oldIndex];
			  newIndex++;
			
				}
			}
			goldNames=Arrays.copyOf(goldNames,newIndex);
			isGoldNameDeleted=true;
		}
return isGoldNameDeleted;		
	}
}