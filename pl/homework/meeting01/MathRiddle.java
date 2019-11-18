package pl.homework.z1;

import java.util.Random;
import java.util.Scanner;

public class MathRiddle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int x = ran.nextInt(10);
		int y = ran.nextInt(10);
		x++;
		y++; // we have to make them 1-10
		System.out.println("Pierwsza wylosowana liczba to:" + x);
		System.out.println("Druga wylosowana liczba to: " + y);
		int result = x * y;
		int guess = 0;
		int counter = 0;
		System.out.println("Jaki jest iloczyn tych liczb?");
		do {
			System.out.println("Wpisz odpowiedz:");
			guess = scan.nextInt();
			counter++;
			if (guess != result)
			{System.out.println("Błędna odpowiedz!");}
		} while (result != guess);
		System.out.println("Brawo, zgadłeś w " + counter+ " próbie!" );

	}

}
