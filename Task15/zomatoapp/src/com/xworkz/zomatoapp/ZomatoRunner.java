package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.Food.Food;
import com.xworkz.zomatoapp.Zomato.Zomato;

public class ZomatoRunner {

    public  static void main(String args[]) {

        System.out.println("MAIN METHOD STARTED");

        Zomato zomato=new Zomato();
        zomato.ratings=5;

        Food food=new Food();
        food.foodName = "Biryani";
        food.price = 350;
        food.quantity = 1;
        food.hotelName = "Meghans Biryani";

        zomato.delivered(food);

        System.out.println("MAIN ENDED");
    }
}
