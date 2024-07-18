class Zomato{
	static boolean isAvailable;
	public static double getFood(String foodName){
	//"Pizza"=="Pizza";
	if(foodName=="Pizza"){
		return 99.00;
	}
	if(foodName=="Burger"){
		return 120.00;
	}
	if(foodName=="Paneer Bread"){
		return 104.00;
	}
	if(foodName=="Kalakand"){
		return 140.00;
	}
	if(foodName=="Laccha Paratha"){
		return 132.00;
	}
	if(foodName=="Rasam"){
		return 40.00;
	}
	if(foodName=="Cheese Pizza"){
		return 200.00;
	}
	if(foodName=="Watermelon"){
		return 45.00;
	}
	if(foodName=="Kadai Chicken"){
		return 230.00;
	}
	if(foodName=="Tomato Rice"){
		return 70.00;
	}
	if(foodName=="Paneer Roll"){
		return 45.00;
	}
	if(foodName=="Peri Peri Fries"){
		return 65.00;
	}
	if(foodName=="Egg Curry"){
		return 89.00;
	}
	if(foodName=="Honey Chilli"){
		return 137.00;
	}
	if(foodName=="Chicken Masala"){
		return 386.00;
	}
	else{
		System.out.println(foodName + "Not Found");
	}
	return 0.0;
	}
	public static double getFood(String foodName,int quantity){
		double price=0.0;
		//if(foodName=="pizza") return 99.0 *quantity;
		if(foodName=="pizza"){
			price=99.0*quantity ;
			return price;
		}
		if(foodName=="Burger"){
			price=120.00*quantity;
			return price;
		}
		if(foodName=="Paneer Bread"){
			price=104.00*quantity;
			return price;
		}
		if(foodName=="Kalakand"){
		price=140.00*quantity;
		return price;
	}
	if(foodName=="Laccha Paratha"){
		price=132.00*quantity;
		return price;
	}
	if(foodName=="Rasam"){
		price= 40.00*quantity;
		return price;
	}
	if(foodName=="Cheese Pizza"){
		price=200.00*quantity;
		return price;
	}
	if(foodName=="Watermelon"){
		price=45.00*quantity;
		return price;
	}
	if(foodName=="Kadai Chicken"){
		price=230.00*quantity;
		return price;
	}
	if(foodName=="Tomato Rice"){
		price=70.00*quantity;
		return price;
	}
	if(foodName=="Paneer Roll"){
		price=45.00*quantity;
		return price;
	}
	if(foodName=="Peri Peri Fries"){
		price=65.00*quantity;
		return price;
	}
	if(foodName=="Egg Curry"){
		price=89.00*quantity;
		return price;
	}
	if(foodName=="Honey Chilli"){
		price=137.00*quantity;
		return price;
	}
	if(foodName=="Chicken Masala"){
		price=386.00*quantity;
		return price;
	}
	else{
		System.out.println(foodName + "Not Found");
	}
	return 0.0;
	}

	
		
		
}
