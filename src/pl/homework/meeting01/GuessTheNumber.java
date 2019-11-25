package pl.homework.meeting01;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int x = ran.nextInt(1000);
		System.out.println("Wylosowałem liczbę od 0 do 999, spróbuj zgadnąć");
		int guess = 0;
		int counter = 0;
		do {
			System.out.println("Wpisz odpowiedz:");
			guess = scan.nextInt();
			counter++;
			if (guess < x) {
				System.out.println("Twoja liczba jest za mała");
			}
			if (guess > x) {
				System.out.println("Twoja liczba jest za duża");
			}
		} while (x != guess);
		System.out.println("Brawo, zgadłeś w " + counter + " próbie!");
		scan.close();
	}

}
