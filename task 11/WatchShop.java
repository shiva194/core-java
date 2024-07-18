import java.util.*;
class WatchShop{

static String watchNames[]={null,null,null,null,null,null,null,null,null,null};
static int index;


public static boolean addWatchBrandNames(String watchName){
	boolean iswatchnameadded=false;
	 if(index<watchNames.length){
	if(watchName!=null){
			watchNames[index]=watchName;
			index++;
			iswatchnameadded=true;
			}
			else{
			System.out.println("add valid brand name");
			}
		}
		else{
		System.out.println("brand name list is full");
		}
	return iswatchnameadded;
	}
	
	
	public static void getAllWatchBrands(){
	
	for(String names:watchNames){
		System.out.println(names+"\n");
		}
	}
	
	
	
	
	public static boolean updateWatchBrands(String oldWatchName, String newWatchName){
	    boolean iswatchnameupdated=false;
		for(int watchNameindex=0;watchNameindex<watchNames.length;watchNameindex++){
		if(oldWatchName==watchNames[watchNameindex]){
			
			watchNames[watchNameindex]=newWatchName;
			iswatchnameupdated=true;
			}
		}
		return iswatchnameupdated;
	}
	
	
	 public static boolean deleteWatchName(String oldName){
		 boolean isWatchNameDeleted=false;
		 
		 int newIndex,oldIndex;
		 if(oldName!=null){
			 for(newIndex=0,oldIndex=0;oldIndex<watchNames.length;oldIndex++){
				 if(oldName!=watchNames[oldIndex]){
					 watchNames[newIndex]=watchNames[oldIndex];
					 newIndex++;
				 }
			 }
			 watchNames=Arrays.copyOf(watchNames,newIndex);
			 isWatchNameDeleted=true;
		 }
		 return isWatchNameDeleted;
	 }
}