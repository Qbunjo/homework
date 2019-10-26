package tablice;

import java.util.Arrays;

public class Tablice2 {

	public static void main(String[] args) {
		String[] imiona = { "Ala", "Ola", "Ela", "Adam", "Ludwik", "Ksawery" };
		int[] liczby = { 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110 };
		System.out.println(Arrays.toString(imiona));
		System.out.println(Arrays.toString(liczby));
		// dwa sposoby przechodzenia przez elementy tablic za pomocą pętli:
		// 1- tradycyjna pętla z licznikiem (bardziej ogólna, pozwala wykonywać bardziej zaawansowane rzeczy)
		// pętla for daje nam poprawne indeksy (pozycje) tablicy i za pomocą tablica[i]
		// odwołujemy się do elementu

		for (int i = 0; i < imiona.length; i++) {
			System.out.println("* " + imiona[i]);
		}
		System.out.println();
		for (int i = 0; i < liczby.length; i++) {
			System.out.println("element numer " + i + " ma wartość " + liczby[i]);
		}
		System.out.println();

		// petla z licznikiem umożliwia zmianę wartości w tablicy
		System.out.println("Liczby przed zmianą:" + Arrays.toString(liczby));
		for (int i = 0; i < liczby.length; i++) {
			liczby[i] += 50;
		}
		System.out.println("Liczby po zmianie:" + Arrays.toString(liczby));
		
		// 2- pętla "for each" lub "enhanced for loop" - nie pozwala na wykonywanie zbyt skomplikowanych zadań, ale jest bardzo prosta w zapisie
		
	}

}
