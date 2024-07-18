public class AmusementParkRunner {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();

        boolean isCreated = park.create("Wonderland", "City Center", 20, 50, 9, 22);

        if (isCreated) {
            park.getInfo();
        } else {
            System.out.println("Failed to create Amusement Park.");
        }
    }
}
