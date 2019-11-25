package pl.schoolwork;

import java.util.Scanner;

public class Srednia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Policzymy srednia:");
		System.out.println("Ile liczb chcesz wpisac?");
		int Tleng = scan.nextInt();
		int[] arr = new int[Tleng];
		for (int i = 0; i < Tleng; i++) {
			System.out.println("Wpisz liczbę nr " + (i + 1));
			arr[i] = scan.nextInt();
		}
		System.out.println("Liczymy średnią");
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum /= arr.length;
		System.out.println("Srednia tych liczb: " + sum);
	}

}
