class Dominos{
	
	public  static double orderFood(String foodName){
	if(foodName=="Veggie pizz"){
		return 643.00;
	}
	if(foodName=="Chicken Pizza"){
		return 1765.00;
	}
	if(foodName=="Green Pepper pizza"){
		return 852.00;
	}
	if(foodName=="Onion Pizza"){
		return 215.00;
	}
	if(foodName=="Ham Pizza"){
		return 659.00;
	}
	if(foodName=="Cheese Pizza"){
		return 753.00;
	}
	if(foodName=="Onion pepper Pizza"){
		return 754.00;
	}
	if(foodName=="Paneer Pizza"){
		return 875.00;
	}
	if(foodName=="Veg Pizza"){
		return 964.00;
	}
	if(foodName=="Thin Crust Veggie Pizza"){
		return 1242.00;
	}
	if(foodName=="Spicy Pineapple Chicken Pizza"){
		return 1842.00;
	}
	if(foodName=="Classic Garden Salad"){
		return 769.00;
	}
	if(foodName=="Hand Tossed Pizza"){
		return 965.00;
	}
	if(foodName=="Grilled Chicken Caesar Salad"){
		return 1786.00;
	}
	if(foodName=="Small Pacific Veggie Pizza"){
		return 985.00;
	}
	else{
	System.out.println(foodName + "Not Found");
	}
	return 0.0;
	}
}
