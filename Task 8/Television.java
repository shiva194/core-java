class Television {
	
	static boolean isconnected;
	static int currentvolume;
	static int maxvolume=7;
	static int minvolume;
	public static void onOrOff() {
	System.out.println("onOrOff started");
	if(isconnected==true) {
		isconnected=false;
		System.out.println("Television is on");
	}
	else if(isconnected==false){
		isconnected=true;
		System.out.println("Television is off");
	}
	System.out.println("onOrOff ended");
	return;
	}
	//behavioural/functionalities
	public static void increasevolume() {
	System.out.println("increasevolume started");
		if(isconnected==true){
			if(currentvolume<maxvolume){
				currentvolume=currentvolume+1;
				System.out.println("The currentvolume is "+currentvolume);
			}
			else{
				System.out.println("max volume is reached");
			}
		}
		else {
			System.out.println("turn on television");
		}
		System.out.println("increasevolume ended");
		return;
	}
	public static void decreasevolume() {
		System.out.println("decreasevolume started");
			if(isconnected==true){
				if(currentvolume>minvolume){
					currentvolume=currentvolume-1;
					System.out.println("The volume is "+currentvolume);
				}
				else{
					System.out.println("min volume is reached");
				}
			}
			else{
				System.out.println("Turn off the system");
			}
			System.out.println("decreasevolume ended");
			return;
			
		}
		
	public static void toGetDetails() {
	String name="Panasonic";
	double price=65000;
	System.out.println("The brand name is " +name);
	System.out.println("The price is " +price);
	}
}