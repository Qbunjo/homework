package pl.homework.meeting01;

import java.util.Scanner;

public class Heron_formula {

	public static void main(String[] args) {
		System.out.println("Program obliczający pole trójkąta z wzoru Herona");
		System.out.println("Boki a, b c");
		Scanner scan = new Scanner(System.in);
		System.out.println("Wpisz długość boku a: ");
		double aLeng = scan.nextDouble();
		System.out.println("Wpisz długość boku b: ");
		double bLeng = scan.nextDouble();
		System.out.println("Wpisz długość boku c: ");
		double cLeng = scan.nextDouble();
		if ((aLeng + bLeng > cLeng) && (bLeng + cLeng > aLeng) && (aLeng + cLeng > bLeng)) {
			double p = ((aLeng + bLeng + cLeng) / 2);
			System.out.println("p=" + p);
			double result = Math.sqrt(p * (p - aLeng) * (p - bLeng) * (p - cLeng));
			System.out.println("Pole trójkąta wynosi: " + result);
		} else
			System.out.println("Taki trójkąt nie istnieje!");
		scan.close();
	}

}
