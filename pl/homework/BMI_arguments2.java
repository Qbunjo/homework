package homework1;

import java.util.Scanner;

public class BMI_arguments2 {

	public static void main(String[] args) {
		System.out.println("Program obliczający BMI poprzez klasę skaner");
		Scanner scan = new Scanner(System.in);
		System.out.println("Wpisz swoją wagę w kg:");
		Double weight = scan.nextDouble();
		System.out.println("Wpisz swój wzrost w cm:");
		Double height = scan.nextDouble();
		height = height / 100;
		double result = ((weight / (height * height)));
		System.out.println("Twoje BMI wynosi: " + result);
		scan.close();
	}

}
