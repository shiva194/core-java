class GiriasRunner {
    public static void main(String[] args) {
        boolean appliance = Girias.createHomeAppliance("Refrigerator");
        appliance = Girias.createHomeAppliance("Washing Machine");
        appliance = Girias.createHomeAppliance("Microwave Oven");
        appliance = Girias.createHomeAppliance("Air Conditioner");
        appliance = Girias.createHomeAppliance("Water Heater");
        appliance = Girias.createHomeAppliance("Vacuum Cleaner");
        appliance = Girias.createHomeAppliance("Dishwasher");
        appliance = Girias.createHomeAppliance("Television");
        appliance = Girias.createHomeAppliance("Mixer Grinder");
        appliance = Girias.createHomeAppliance("Induction Stove");
        appliance = Girias.createHomeAppliance("Blender");
        appliance = Girias.createHomeAppliance("Toaster");

        Girias.getHomeAppliances();
		System.out.println("\n\n\n");
	appliance=Girias.deletehomeAppliancName("Refrigerator");
	if(appliance!=false){
		Girias.getHomeAppliances();
    }
	}
}
