package pl.homework.z1;

public class BMI_arguments3 {

	public static void main(String[] args) {
		
		System.out.println("Program obliczający BMI poprzez argumenty");
		System.out.println("Twoja waga w kg:"+ args[0]);
		System.out.println("Twój wzrost w cm:"+ args[1]);
		double weight = Double.parseDouble(args[0]);
		double height = Double.parseDouble(args[1]);
		height = height /100;
			double result = ((weight / Math.pow(height,2)));
		System.out.println("Twoje BMI wynosi: " + result);

	}

}
