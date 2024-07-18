class SimCard {

    String ownerName;
    String phoneNumber;
    String planType;
    int dataBalance;
    int validityInDays;

    public boolean create(String ownerName, String phoneNumber, String planType, int dataBalance, int validityInDays) {
        boolean isCreated = false;
        if (ownerName != null && phoneNumber != null && planType != null && dataBalance > 0 && validityInDays > 0) {
            this.ownerName = ownerName;
            this.phoneNumber = phoneNumber;
            this.planType = planType;
            this.dataBalance = dataBalance;
            this.validityInDays = validityInDays;
            isCreated = true;
        }
        return isCreated;
    }

    public void getInfo() {
        System.out.println("owner Name: " + this.ownerName);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Plan Type: " + this.planType);
        System.out.println("Data Balance: " + this.dataBalance + "MB");
        System.out.println("Validity (in days): " + this.validityInDays);
    }
}
