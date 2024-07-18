import java.util.*;

class Girias {
    static String[] homeAppliances = {null,null,null,null,null,null,null,null,null,null,null,null};
    static int index = 0;

    public static boolean createHomeAppliance(String applianceName) {
        boolean isApplianceCreated = false;
        if (applianceName != null ) {
            homeAppliances[index] = applianceName;
            index++;
            isApplianceCreated = true;
        } else {
            if (applianceName == null) {
                System.out.println("Appliance name cannot be null");
            } else {
                System.out.println("Array is full. Cannot add more appliances.");
            }
        }
        return isApplianceCreated;
    }

    public static void getHomeAppliances() {
        for (String appliance : homeAppliances) {
            if (appliance != null) {
                System.out.println(appliance);
            }
        }
    }
	
	public static boolean deletehomeAppliancName(String oldName){
      boolean isdeletehomeAppliancName=false;	
int newIndex;
int oldIndex;
			if(oldName!=null){
	for(newIndex=0,oldIndex=0;oldIndex<homeAppliances.length;oldIndex++){
		if(oldName!=homeAppliances[oldIndex]){
			homeAppliances[newIndex]=homeAppliances[oldIndex];
			newIndex++;
			isdeletehomeAppliancName=true;
			}
		}
		homeAppliances=Arrays.copyOf(homeAppliances,newIndex);
			}
			else{
				System.out.println("enter a valid name");
			}
	return isdeletehomeAppliancName;
	}
}

