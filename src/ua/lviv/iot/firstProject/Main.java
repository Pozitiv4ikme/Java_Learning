package ua.lviv.iot.firstProject;

public class Main {

	public static void main(String[] args) {
		
		LawnMower Bosh = new LawnMower();
		LawnMower Husqvarna = new LawnMower(1, 24, 10.6);
		LawnMower Karcher = new LawnMower(4, 18, 5, "LMO 18-33 Battery Set EU", "KA'RCHER", 2020);

		System.out.println(LawnMower.getStaticField());
		System.out.println(Bosh);
		System.out.println(Husqvarna);
		System.out.println(Karcher);
	}
}

