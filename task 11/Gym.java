import java.util.*;

class Gym {
    static String[] gymEquipments = {null,null,null,null,null,null,null,null};
    static int index = 0;

    public static boolean createGymEquipment(String equipmentName) {
        boolean isEquipmentCreated = false;
        if (equipmentName != null) {
            gymEquipments[index] = equipmentName;
            index++;
            isEquipmentCreated = true;
        } else {
            System.out.println("Equipment name cannot be null");
        }
        return isEquipmentCreated;
    }

    public static void getGymEquipments() {
        for (String equipment : gymEquipments) {
            if (equipment != null) {
                System.out.println(equipment);
            }
        }
    }
	
	public static boolean deletGymEquipment(String oldGymEquipment){
	
      boolean isdeletGymEquipment=false;
	  int newIndex,oldIndex;
	  for(newIndex=0,oldIndex=0;oldIndex<gymEquipments.length;oldIndex++){
		if(oldGymEquipment!=gymEquipments[oldIndex]){
			gymEquipments[newIndex]=gymEquipments[oldIndex];
			newIndex++;
		}  
	  }
	  gymEquipments= Arrays.copyOf(gymEquipments,newIndex);
	  if(gymEquipments!=null){
		  isdeletGymEquipment=true;
	  }
	  return isdeletGymEquipment;
	}
}
