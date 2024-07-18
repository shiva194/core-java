class Zepto {

	public static double takeOrder(String foodName) {
	if(foodName=="Karachi Biscuits"){
		return 174.00;
	}
	if(foodName=="Marie Biscuits") {
		return 80.00;
	}
	if(foodName=="Oreo Biscuits"){
		return 90.00;
	}
	if(foodName=="Mazza juice") {
		return 40.00;
	}
	if(foodName=="Panner"){
		return 110.00;
	}
	if(foodName=="Pepsi"){
		return 50.00;
	}
	if(foodName=="Lunch Box"){
		return 30.00;
	}
	if(foodName=="Onion"){
		return 54.00;
	}
	if(foodName=="Nandini Milk"){
		return 24.00;
	}
	if(foodName=="Egg"){
		return 35.00;
	}
	if(foodName=="Idli n Dosa batter"){
		return 150.00;
	}
	if(foodName=="Wheat Bread"){
		return 55.00;
	}
	if(foodName=="Amul Butter"){
		return 275.00;
	}
	if(foodName=="Frozen green peas"){
		return 148.00;
	}
	if(foodName=="Dairy milk silk"){
		return 70.00;
	}
	else
	{
		System.out.println(foodName + "NOT FOUND");
	}
	return 0.0;
	}
}