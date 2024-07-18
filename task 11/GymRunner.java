class GymRunner {
    public static void main(String[] args) {
        boolean equipment = Gym.createGymEquipment("Treadmill");
        equipment = Gym.createGymEquipment("Dumbbells");
        equipment = Gym.createGymEquipment("Bench Press");
        equipment = Gym.createGymEquipment("Elliptical");
        equipment = Gym.createGymEquipment("Stationary Bike");
        equipment = Gym.createGymEquipment("Rowing Machine");
        equipment = Gym.createGymEquipment("Leg Press");
        equipment = Gym.createGymEquipment("Pull-up Bar");

        Gym.getGymEquipments();
		
		Gym.deletGymEquipment("Stationary Bike");
		
		System.out.println("gym Equipments list modifieded");
		Gym.getGymEquipments();
    }
}
