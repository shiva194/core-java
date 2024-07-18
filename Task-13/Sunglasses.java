public class Sunglasses {

    String brand;
    String model;
    String frameColor;
    String lensColor;
    boolean isPolarized;
    double price;

    public boolean create(String brand, String model, String frameColor, String lensColor, boolean isPolarized, double price) {
        boolean isCreated = false;
        if (brand != null && model != null && frameColor != null && lensColor != null && price > 0) {
            this.brand = brand;
            this.model = model;
            this.frameColor = frameColor;
            this.lensColor = lensColor;
            this.isPolarized = isPolarized;
            this.price = price;
            isCreated = true;
        }
        return isCreated;
    }

    public void getInfo() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Frame Color: " + this.frameColor);
        System.out.println("Lens Color: " + this.lensColor);
        System.out.println("Is Polarized: " + (this.isPolarized ? "Yes" : "No"));
        System.out.println("Price: $" + this.price);
    }
}
