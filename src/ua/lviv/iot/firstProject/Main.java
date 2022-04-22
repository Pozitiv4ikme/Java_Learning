package ua.lviv.iot.firstProject;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		LawnMower bosh = new LawnMower();
		LawnMower husqvarna = new LawnMower(1, 24, 10.6);
		LawnMower karcher = new LawnMower(4, 18, 5, "LMO 18-33 Battery Set EU", "KA'RCHER", 2020);

		//List<LawnMower> listOfProduct = new ArrayList<>();
		//listOfProduct.add(bosh);
		//listOfProduct.add(husqvarna);
		//listOfProduct.add(karcher);

		//int i = 0;
		//while(i < listOfProduct.size()) {
		//	System.out.println(listOfProduct.get(i));
		//	i++;
		//}

		System.out.println(LawnMower.getStaticField());
		System.out.println(bosh);
		System.out.println(husqvarna);
		System.out.println(karcher);
	}

	//int firstNumber = 10;
	//int secondNumber = 20;
	//int thirdNumber = 20;

	//if(firstNumber > secondNumber) {
	//	System.out.println("The first number is greater than the second");
	// }
	//else {
	//	System.out.println("The second number is greater than the first");
	// }

	//or

	//if(secondNumber == thirdNumber) {
	//	System.out.println("The numbers are the same");
	// }
	//else if(firstNumber > secondNumber) {
	//	System.out.println("The first number is greater than the second");
	// }
	//else {
	//	System.out.println("The second number is greater than the first");
	// }
}

