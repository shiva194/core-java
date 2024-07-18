public class Shampoo {
    String brandName;
    int id;
    int qty;
    String type;
    double price;
    String mgfDate;
    String expDate;

    public void washCars() {
        System.out.println("Using " + brandName + " shampoo to wash cars.");
    }
}

class ShampooRunner {
    public static void main(String[] args) {
        // Creating 15 objects of Shampoo class
        Shampoo shampoo1 = new Shampoo();
        shampoo1.id = 1;
        shampoo1.brandName = "Pat";
        shampoo1.qty = 2;
        shampoo1.type = "Anti-Dandruff";
        shampoo1.price = 10.99;
        shampoo1.mgfDate = "2023-01-01";
        shampoo1.expDate = "2025-01-01";

        Shampoo shampoo2 = new Shampoo();
        shampoo2.id = 2;
        shampoo2.brandName = "Clear";
        shampoo2.qty = 3;
        shampoo2.type = "Moisturizing";
        shampoo2.price = 8.99;
        shampoo2.mgfDate = "2023-05-01";
        shampoo2.expDate = "2025-05-01";

        Shampoo shampoo3 = new Shampoo();
        shampoo3.id = 3;
        shampoo3.brandName = "Dove";
        shampoo3.qty = 1;
        shampoo3.type = "Volumizing";
        shampoo3.price = 9.99;
        shampoo3.mgfDate = "2023-02-01";
        shampoo3.expDate = "2025-02-01";

        Shampoo shampoo4 = new Shampoo();
        shampoo4.id = 4;
        shampoo4.brandName = "Head & Shoulders";
        shampoo4.qty = 2;
        shampoo4.type = "Sensitive";
        shampoo4.price = 11.49;
        shampoo4.mgfDate = "2023-03-01";
        shampoo4.expDate = "2025-03-01";

        Shampoo shampoo5 = new Shampoo();
        shampoo5.id = 5;
        shampoo5.brandName = "Pantene";
        shampoo5.qty = 2;
        shampoo5.type = "Smooth & Silky";
        shampoo5.price = 12.99;
        shampoo5.mgfDate = "2023-04-01";
        shampoo5.expDate = "2025-04-01";

        Shampoo shampoo6 = new Shampoo();
        shampoo6.id = 6;
        shampoo6.brandName = "Herbal Essences";
        shampoo6.qty = 1;
        shampoo6.type = "Cleansing";
        shampoo6.price = 9.49;
        shampoo6.mgfDate = "2023-06-01";
        shampoo6.expDate = "2025-06-01";

        Shampoo shampoo7 = new Shampoo();
        shampoo7.id = 7;
        shampoo7.brandName = "Garnier";
        shampoo7.qty = 3;
        shampoo7.type = "Fructis";
        shampoo7.price = 8.49;
        shampoo7.mgfDate = "2023-07-01";
        shampoo7.expDate = "2025-07-01";

        Shampoo shampoo8 = new Shampoo();
        shampoo8.id = 8;
        shampoo8.brandName = "Tresemme";
        shampoo8.qty = 1;
        shampoo8.type = "Keratin Smooth";
        shampoo8.price = 13.99;
        shampoo8.mgfDate = "2023-08-01";
        shampoo8.expDate = "2025-08-01";

        Shampoo shampoo9 = new Shampoo();
        shampoo9.id = 9;
        shampoo9.brandName = "Suave";
        shampoo9.qty = 2;
        shampoo9.type = "Daily Clarifying";
        shampoo9.price = 6.99;
        shampoo9.mgfDate = "2023-09-01";
        shampoo9.expDate = "2025-09-01";

        Shampoo shampoo10 = new Shampoo();
        shampoo10.id = 10;
        shampoo10.brandName = "Aveda";
        shampoo10.qty = 1;
        shampoo10.type = "Color Conserve";
        shampoo10.price = 14.99;
        shampoo10.mgfDate = "2023-10-01";
        shampoo10.expDate = "2025-10-01";

        Shampoo shampoo11 = new Shampoo();
        shampoo11.id = 11;
        shampoo11.brandName = "Redken";
        shampoo11.qty = 2;
        shampoo11.type = "All Soft";
        shampoo11.price = 15.99;
        shampoo11.mgfDate = "2023-11-01";
        shampoo11.expDate = "2025-11-01";

        Shampoo shampoo12 = new Shampoo();
        shampoo12.id = 12;
        shampoo12.brandName = "Nexxus";
        shampoo12.qty = 1;
        shampoo12.type = "Humectress";
        shampoo12.price = 16.49;
        shampoo12.mgfDate = "2023-12-01";
        shampoo12.expDate = "2025-12-01";

        Shampoo shampoo13 = new Shampoo();
        shampoo13.id = 13;
        shampoo13.brandName = "Matrix";
        shampoo13.qty = 3;
        shampoo13.type = "Biolage";
        shampoo13.price = 17.49;
        shampoo13.mgfDate = "2024-01-01";
        shampoo13.expDate = "2026-01-01";

        Shampoo shampoo14 = new Shampoo();
        shampoo14.id = 14;
        shampoo14.brandName = "Bumble and Bumble";
        shampoo14.qty = 2;
        shampoo14.type = "Thickening";
        shampoo14.price = 18.99;
        shampoo14.mgfDate = "2024-02-01";
        shampoo14.expDate = "2026-02-01";

        Shampoo shampoo15 = new Shampoo();
        shampoo15.id = 15;
        shampoo15.brandName = "Pureology";
        shampoo15.qty = 1;
        shampoo15.type = "Hydrate";
        shampoo15.price = 19.99;
        shampoo15.mgfDate = "2024-03-01";
        shampoo15.expDate = "2026-03-01";

        // Printing details of each shampoo object
        printShampooDetails(shampoo1);
        printShampooDetails(shampoo2);
        printShampooDetails(shampoo3);
        printShampooDetails(shampoo4);
        printShampooDetails(shampoo5);
        printShampooDetails(shampoo6);
        printShampooDetails(shampoo7);
        printShampooDetails(shampoo8);
        printShampooDetails(shampoo9);
        printShampooDetails(shampoo10);
        printShampooDetails(shampoo11);
        printShampooDetails(shampoo12);
        printShampooDetails(shampoo13);
        printShampooDetails(shampoo14);
        printShampooDetails(shampoo15);
    }

    public static void printShampooDetails(Shampoo shampoo) {
        System.out.println("Shampoo Details: ");
        System.out.println("ID: " + shampoo.id);
        System.out.println("Brand Name: " + shampoo.brandName);
        System.out.println("Quantity: " + shampoo.qty);
        System.out.println("Type: " + shampoo.type);
        System.out.println("Price: $" + shampoo.price);
        System.out.println("Manufacture Date: " + shampoo.mgfDate);
        System.out.println("Expiry Date: " + shampoo.expDate);
        shampoo.washCars();
        System.out.println();
    }
}
