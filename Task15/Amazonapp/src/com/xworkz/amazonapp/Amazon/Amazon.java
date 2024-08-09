package com.xworkz.amazonapp.Amazon;

import com.xworkz.amazonapp.Product.Product;

public class Amazon {

   Product product;
    public int id;

    public boolean ordered(Product product){
        boolean isordered=false;
        if(id==1){
            System.out.println("ORDERED PLACED");
            if(product!=null){
                this.product=product;
                this.product.getDetails();
                isordered=true;
                System.out.println("ORDERED COLLECTED");
            }
            else
                System.out.println("ORDERED NOT FOUND");


        }
        else System.out.println("ORDERED NOT YET PLACED....................");
        return isordered;
    }
}
