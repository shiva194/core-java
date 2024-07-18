class Mixer {
	static boolean isconnected=false;
	//currentTemperature is variable
	static int currentspeed;
	static int minspeed;
	static int maxspeed=6;
	public static void onOrOff() {
	System.out.println("onOrOff started");
	//false=false
	if(isconnected==false){
	isconnected=true;
	System.out.println("Mixer turned on");
	}
	else if(isconnected==true){
	isconnected=false;
	System.out.println("Mixer turned off");
	}
	System.out.println("onOrOff ended");
	return;
	}
	public static void increasespeed() {
		System.out.println("increasespeed() started");
		if(isconnected==true){
			if(currentspeed<maxspeed){
			 currentspeed=currentspeed+1;
			 System.out.println("The currentspeed is " +currentspeed);
			}
			else{
				System.out.println("Max speed is reached");
			}
		}
		else{
			System.out.println("On the mixer");
		}
		System.out.println("increasespeed() ended");
		return;
	}
	public static void toGetDetails() {
	String name="Sony";
	double price=8000;
	System.out.println("The brand name is " +name);
	System.out.println("The price is " +price);
	}
}