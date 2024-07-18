class Microwave{                                                                      
	
	static boolean isconnected=true;
	static int currentVolume;
	static int maxVolume=5;
	public static void onOrOff() {
	System.out.println("onOrOff started");
	if(isconnected==false) {
	isconnected=true;
	System.out.println("Microwave is turned on");
	}
	else if(isconnected=true) {
		isconnected=false;
		System.out.println("Microwave is turned OFF");
		}
	System.out.println("onOrOff ended");
	return;
	}
	public static void increaseVolume() {
		System.out.println("increaseVolume started");
		if(isconnected==true) {
			if(currentVolume<maxVolume) {
				currentVolume=currentVolume+1;
				System.out.println("The volume is " +currentVolume);
			}
			else {
				System.out.println("The maximum volume is reached");
			}
		}
		else {
			System.out.println("ON the microwave");
		}
		System.out.println("increaseVolume ended");
		return;
	}
	
	public static void toGetDetails() {
	String name="Philips";
	double price=9000;
	System.out.println("The brand name is " +name);
	System.out.println("The price is " +price);
	}
}