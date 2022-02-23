package ua.lviv.iot.firstProject;

public class Main {

	public static void main(String[] args) {
		
		LawnMower bosh = new LawnMower();
		LawnMower husqvarna = new LawnMower(1, 24, 10.6);
		LawnMower karcher = new LawnMower(4, 18, 5, "LMO 18-33 Battery Set EU", "KA'RCHER", 2020);

		System.out.println(LawnMower.getStaticField());
		System.out.println(bosh);
		System.out.println(husqvarna);
		System.out.println(karcher);
	}

}
