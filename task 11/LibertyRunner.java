class LibertyRunner {

    public static void main(String[] args) {
        boolean isBrandAdded = Liberty.addShoeBrandsName("Nike");
        isBrandAdded = Liberty.addShoeBrandsName("Adidas");
        isBrandAdded = Liberty.addShoeBrandsName("Puma");
        isBrandAdded = Liberty.addShoeBrandsName("Reebok");
        isBrandAdded = Liberty.addShoeBrandsName("Converse");
        isBrandAdded = Liberty.addShoeBrandsName("New Balance");
        isBrandAdded = Liberty.addShoeBrandsName("Skechers");
        isBrandAdded = Liberty.addShoeBrandsName("Asics");
        isBrandAdded = Liberty.addShoeBrandsName("Under Armour");
        isBrandAdded = Liberty.addShoeBrandsName("Vans");
        isBrandAdded = Liberty.addShoeBrandsName("Fila");
        isBrandAdded = Liberty.addShoeBrandsName("Brooks");
        isBrandAdded = Liberty.addShoeBrandsName("Saucony");
        isBrandAdded = Liberty.addShoeBrandsName("Hoka One One");
        isBrandAdded = Liberty.addShoeBrandsName("Mizuno");

        if (isBrandAdded==true) {
            Liberty.getAllBrands();
        }

        System.out.println("\n\n");
        System.out.println("Updated brands name list \n");
        isBrandAdded = Liberty.updateShoeBrands("Puma", "unknown");
        if (isBrandAdded==true) {
			System.out.println("\n\n\n");
            Liberty.getAllBrands();
        }
		isBrandAdded = Liberty.deletBrandName("Saucony");
		if (isBrandAdded==true) {
			System.out.println("\n\n\n");
           Liberty.getAllBrands();
        }
    }
}