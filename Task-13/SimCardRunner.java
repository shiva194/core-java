public class SimCardRunner {
    public static void main(String[] args) {
        SimCard simCard = new SimCard();

        boolean isCreated = simCard.create("CarrierX", "1234567890", "Unlimited", 1024, 30);

        if (isCreated) {
            simCard.getInfo();
        } else {
            System.out.println("Failed to create SimCard.");
        }
    }
}
