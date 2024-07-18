class Speaker {
	
	static boolean isconnected=false;
	static int currentVolume;
	static int maxVolume=8;
	static int minVolume;
	public static void onOrOff() {
	System.out.println("onOrOff started");
	if(isconnected==true) {
		isconnected=false;
		System.out.println("Speaker is turned on");
	}
	else if(isconnected==false) {
		isconnected=true;
		System.out.println("Speakeris turned off");
	}
	System.out.println("onOrOff ended");
	return;
	}
	public static void increaseVolume() {
		System.out.println("increaseVolume started");
		if(isconnected==false) {
			if(currentVolume<=maxVolume) {
				currentVolume=currentVolume+1;
				System.out.println("speaker is turned on");
			}
			else
			{
				System.out.println("speaker is turned off");
			}
		}
		else
		{
			System.out.println("turn on the speaker");
		}
		System.out.println("increaseVolume ended");
		return;
		}
		

	public static void toGetDetails() {
	String name="Sony";
	double price=5000;
	System.out.println("The brand name is " +name);
	System.out.println("The price is " +price);
	}
}