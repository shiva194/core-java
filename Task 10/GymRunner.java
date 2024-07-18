class GymRunner {

	public static void main(String[] equipments){
	
	boolean isAdded=Gym.createGymEquipments("Smith");
	System.out.println("is gym equipments addeed : " +isAdded);
	isAdded=Gym.createGymEquipments("Functional trainer");
	System.out.println("is equipments addeed : " +isAdded);
	isAdded=Gym.createGymEquipments("Leg press");
	System.out.println("is equipments addeed : " +isAdded);
	 isAdded=Gym.createGymEquipments(null);
	System.out.println("is equipments addeed : " +isAdded);
	isAdded=Gym.createGymEquipments("Skier");
	System.out.println("is equipments addeed : " +isAdded);
	isAdded=Gym.createGymEquipments("Skier leg");
	System.out.println("is equipments addeed : " +isAdded);
	
	Gym.getGymEquipments();
	//Gym.getEquipmentPrice();
	}
	}