class FiveStarChicken{
	
	public static double takeOrder(String foodName){
	if(foodName=="Veg Roll"){
		return 54.00;
	}
	if(foodName=="Chicken Roll") {
		return 58.00;
	}
	if(foodName=="Chicken Hot Dog"){
		return 58.00;
	}
	if(foodName=="Chicken Burger") {
		return 50.00;
	}
	if(foodName=="MasalaFries"){
		return 45.00;
	}
	if(foodName=="Omlet"){
		return 180.00;
	}
	if(foodName=="Thigh Egg steave"){
		return 80.00;
	}
	if(foodName=="Rice with mushroom"){
		return 90.00;
	}
	if(foodName=="Red curry"){
		return 180.00;
	}
	if(foodName=="Garlic pepper"){
		return 78.00;
	}
	if(foodName=="Chicken 65"){
		return 80.00;
	}
	if(foodName=="Chicken biryani"){
		return 180.00;
	}
	if(foodName=="Chicken nuggets"){
		return 95.00;
	}
	if(foodName=="Chicken strips"){
		return 35.00;
	}
	if(foodName=="Tandoori Roll"){
		return 40.00;
	}
	else
	{
		System.out.println(foodName + "NOT FOUND");
	}
	return 0.0;
	}
}
