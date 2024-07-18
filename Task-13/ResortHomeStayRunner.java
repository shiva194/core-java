class ResortHomeStayRunner {
    public static void main(String[] args) {
        ResortHomeStay resort = new ResortHomeStay();

        boolean isCreated = resort.create("Beachside Retreat", "Coastal Area", 30, 200, true, true);

        if (isCreated) {
            resort.getInfo();
        } else {
            System.out.println("Failed to create Resort/Homestay.");
        }
    }
}
