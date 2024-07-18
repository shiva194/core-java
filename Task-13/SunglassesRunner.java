public class SunglassesRunner {
    public static void main(String[] args) {
        Sunglasses sunglasses = new Sunglasses();

        boolean isCreated = sunglasses.create("Ray-Ban", "Aviator", "Black", "Green", true, 150.0);

        if (isCreated) {
            sunglasses.getInfo();
        } else {
            System.out.println("Failed to create Sunglasses.");
        }
    }
}
