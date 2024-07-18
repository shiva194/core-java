class GiriasRunner {

	public static void main(String[] shop){
	
	boolean isAdded=Girias.createHomeAppliance("Grinder");
	System.out.println("is appliances addeed : " +isAdded);
	boolean priceAdded=Girias.addApplianceprice(40.0);
	System.out.println("is appliance price added :"+priceAdded);
	isAdded=Girias.createHomeAppliance("Mixer");
	System.out.println("is appliance added : " +isAdded);
	isAdded=Girias.createHomeAppliance("Cooker");
	System.out.println("is appliance added : " +isAdded);
	 isAdded=Girias.createHomeAppliance(null);
	System.out.println("is appliance added : " +isAdded);
	isAdded=Girias.createHomeAppliance("Induction");
	System.out.println("is appliance dded : " +isAdded);
	 isAdded=Girias.createHomeAppliance("Kettle");
	System.out.println("is appliance added : " +isAdded);
	
	
	
	Girias.getGymEquipments();
	Girias.getApplianceprice();
	}
	}