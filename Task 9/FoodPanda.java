class FoodPanda{
	
	public static double takeOrder(String foodName){
	if(foodName=="Masala Dosa"){
		return 60.00;
	}
	if(foodName=="Onion Dosa") {
		return 75.00;
	}
	if(foodName=="Idli"){
		return 50.00;
	}
	if(foodName=="Parrota") {
		return 55.00;
	}
if(foodName=="Poori"){
		return 60.00;
	}
	if(foodName=="Curd Rice"){
		return 60.00;
	}
	if(foodName=="Upma"){
		return 30.00;
	}
	if(foodName=="Dal"){
		return 90.00;
	}
	if(foodName=="Pulavo"){
		return 40.00;
	}
	if(foodName=="Lemon rice"){
		return 35.00;
	}
	if(foodName=="Pasta"){
		return 65.00;
	}
	if(foodName=="Roti"){
		return 30.00;
	}
	if(foodName=="Pongal"){
		return 40.00;
	}
	if(foodName=="Kesribath"){
		return 35.00;
	}
	if(foodName=="Chapathi"){
		return 40.00;
	}
	else
	{
		System.out.println(foodName + "NOT FOUND");
	}
	return 0.0;
	}
}