public class AmusementPark {

    String name;
    String location;
    int numberOfRides;
    int ticketPrice;
    int openingTime;
    int closingTime;

    public boolean create(String name, String location, int numberOfRides, int ticketPrice, int openingTime, int closingTime) {
        boolean isCreated = false;
        if (name != null && location != null && numberOfRides > 0 && ticketPrice > 0 && openingTime >= 0 && closingTime > 0) {
            this.name = name;
            this.location = location;
            this.numberOfRides = numberOfRides;
            this.ticketPrice = ticketPrice;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            isCreated = true;
        }
        return isCreated;
    }

    public void getInfo() {
        System.out.println("Amusement Park Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Number of Rides: " + this.numberOfRides);
        System.out.println("Ticket Price: " + this.ticketPrice);
        System.out.println("Opening Time: " + this.openingTime);
        System.out.println("Closing Time: " + this.closingTime);
    }
}
