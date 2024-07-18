class Zomatotester {
	public static void main(String food[]) {
	System.out.println("main started");
	double price=Zomato.getFood("Paneer Bread");
	System.out.println(price);
	double price=Zomato.getFood("Laccha Paratha",5);
	System.out.println(price);
	System.out.println("main ended");
	}
}