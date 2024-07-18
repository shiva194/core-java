class BlinkIt{
	static boolean isAvailable;
	public static double getFood(String foodName){
	if(foodName=="Spinach"){
		return 643.00;
	}
	if(foodName=="Broccoli"){
		return 216.00;
	}
	if(foodName=="Sweet Potatoes"){
		return 852.00;
	}
	if(foodName=="Blueberries"){
		return 215.00;
	}
	if(foodName=="Oranges"){
		return 659.00;
	}
	if(foodName=="Almonds"){
		return 241.00;
	}
	if(foodName=="Walnuts"){
		return 477.00;
	}
	if(foodName=="Avocado"){
		return 742.00;
	}
	if(foodName=="Salmon"){
		return 230.00;
	}
	if(foodName=="Tuna"){
		return 965.00;
	}
	if(foodName=="Eggs"){
		return 24.00;
	}
	if(foodName=="Greek Yogurt"){
		return 86.00;
	}
	if(foodName=="Brown Rice"){
		return 245.00;
	}
	if(foodName=="Bell Peppers"){
		return 552.00;
	}
	if(foodName=="Chickpeas"){
		return 753.00;
	}
	else{
	System.out.println(foodName + "Not Found");
	}
	return 0.0;
	}
}
