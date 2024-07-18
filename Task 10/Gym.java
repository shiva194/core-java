class Gym{

	static String gymEquipment="";
	static String ownerName="";
	//Datatypes arrayVariable[]={valu};
	static  String gymEquipments[]={null,null,null,null,null,null};
	//static double equipmentPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};	
    static int index;
	//static int index1;
	//static int equipmentindex;
	
	
	public static boolean createGymEquipments(String Gym){
		System.out.println("createGymEquipments started");
		boolean isGymEquipmentsCreated=false;
		if(gymEquipment!=null){
			gymEquipments[index]=gymEquipment;
			index++;
			isGymEquipmentsCreated=true;
		}
		else{
			System.out.println("Gym equipments is null cannot be accepted");
		}
		System.out.println("createGymEquipments ended");
		return isGymEquipmentsCreated;
	}
	// public static boolean addequipmentPrices(double equipmentPrice){
		// System.out.println("addequipmentPrices added");
		// boolean isGymEquipmentsCreated=false;
		// if(equipmentPrice>0.0){
			// equipmentPrices[index1]=equipmentPrice;
			// index1++;
			// isGymEquipmentsCreated=true;
		// }
		// else {
			// System.out.println("Gym equipments is null cannot be accepted");
		// }
		// return isGymEquipmentsCreated;
	// }
		
		
	public static void getGymEquipments(){
		System.out.println("The avilable equipments  are : ");
		for(String gymEquipment1:gymEquipments){
			System.out.println(gymEquipment1);
		}
	}
	// public static void getEquipmentPrice(){
		// System.out.println("The avilable equipment price are: ");
		// for(double equipmentPrice:equipmentPrices) //{
			// System.out.println("The avilable equipment price are: "+equipmentPrice);
		// //}
	// }

}
			