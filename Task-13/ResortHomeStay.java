class ResortHomeStay {

    String name;
    String location;
    int numberOfRooms;
    int pricePerNight;
    boolean hasPool;
    boolean hasWiFi;

    public boolean create(String name, String location, int numberOfRooms, int pricePerNight, boolean hasPool, boolean hasWiFi) {
        boolean isCreated = false;
        if (name != null && location != null && numberOfRooms > 0 && pricePerNight > 0) {
            this.name = name;
            this.location = location;
            this.numberOfRooms = numberOfRooms;
            this.pricePerNight = pricePerNight;
            this.hasPool = hasPool;
            this.hasWiFi = hasWiFi;
            isCreated = true;
        }
        return isCreated;
    }

    public void getInfo() {
        System.out.println("Resort/Homestay Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Number of Rooms: " + this.numberOfRooms);
        System.out.println("Price per Night: $" + this.pricePerNight);
        System.out.println("Has Pool: " + (this.hasPool ? "Yes" : "No"));
        System.out.println("Has WiFi: " + (this.hasWiFi ? "Yes" : "No"));
    }
}
