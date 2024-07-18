class Girias{

	static String homeAppliance="";
	static String ownerName="";
	//Datatypes arrayVariable[]={valu};
	static  String homeAppliances[]={null,null,null,null,null,null};
	static double appliancePrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
    static int index;
	
	
	public static boolean createHomeAppliance(String appliance){
		System.out.println("create HomeAppliance started");
		boolean ishomeApplianceCreated=false;
		if(homeAppliance!=null){
			homeAppliances[index]=homeAppliance;
			index++;
			ishomeApplianceCreated=true;
		}
		else{
			System.out.println("Appliances is null cannot be accepted");
		}
		System.out.println("create HomeAppliance ended");
		return ishomeApplianceCreated;
	}
	public static boolean addApplianceprice(double applianceprice){
		System.out.println("addApplianceprice added");
		boolean isappliancePriceCreated=false;
		if(applianceprice>0.0){
			appliancePrices[index]=applianceprice;
			index++;
			isappliancePriceCreated=true;
		}
		else {
			System.out.println("Appliance price is null cannot be accepted");
		}
		return isappliancePriceCreated;
	}
		
		
	public static void getapplianceNames(){
		System.out.println("The avilable appliances are : ");
		for(String homeAppliance:homeAppliances)//{
			System.out.println("The avilable appliances are "+homeAppliance);
		//}
	}
	public static void getApplianceprice(){
		System.out.println("The avilable appliances price are: ");
		for(double appliancePrice:appliancePrices) //{
			System.out.println("The avilable chats price are: " +appliancePrice);
		//}
	}

}