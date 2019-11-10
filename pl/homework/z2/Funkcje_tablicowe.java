package homework2;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Funkcje_tablicowe {

	static int suma(int[] t) {
		int dodaj = 0;
		for (int element : t) {
			dodaj += element;
		}

		return dodaj;
	}

	static double srednia(int[] t) {
		double average = 0;
		int tabLeng = t.length;
		double podsuma = 0;
		for (int i = 0; i < tabLeng; i++) {
			podsuma += t[i];
		}
		average = podsuma / tabLeng;
		return average;
	}

	static int roznicaMinMax(int[] t) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int wynik = 0;
		if (t.length == 0) {
			return 0;
		}
		for (int element : t) {
			if (element > max) {
				max = element;
			}
		}
		for (int element : t) {
			if (element < min) {
				min = element;
			}
		}

		wynik = max - min;
		return wynik;
	}

	static void WypiszWieksze(int[] t) {
		int x = 5;
		for (int element : t) {
			if (element > x) {
				System.out.println(element);
			}
		}
	}

	static Integer PierwszaWieksza(int[] tab, int b) {
		for (int element : tab) {
			if (element > b) {
				return element;
			}
		}
		return null;
	}

	static int SumaWiekszych(int[] tab, int a) {
		int b = 0;
		for (int element : tab) {
			if (element > a) {
				b += element;
			}
		}
		return b;
	}

	static int IleWiekszych(int[] tab, int a) {
		int b = 0;
		for (int element : tab) {
			if (element > a) {
				b++;
			}
		}
		return b;
	}
	static void WypiszPodzielne(int[]tab,int a) {
		for (int element:tab) {
			if (element%a==0) {System.out.println(element);
		}}
	}

	static Integer max(int[] t) {
		if (t.length == 0) {
			return null;
		}

		int max = Integer.MIN_VALUE;
		for (int element : t) {
			if (element > max) {
				max = element;
			}
		}

		return max;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 3, 8, 5, 7, 2,9,3,2,7,4,1,3,10,12,7 };
		int[] b = { -10, -100, -15, -7, -27 };
		int[] e = {};

		System.out.println("wartosc maksymalna tablicy a " + max(a));
		System.out.println(max(b));
		System.out.println(max(e));
		System.out.println();
		System.out.println("suma " + suma(a));

		System.out.println("Średnia:" + srednia(a));

		System.out.println("różnica MinMax:" + roznicaMinMax(a));

		System.out.println("Wypisz wieksze:");
		WypiszWieksze(a);

		System.out.println("Pierwsza wieksza:" + PierwszaWieksza(a, 4));

		System.out.println("Suma większych:" + SumaWiekszych(a, 3));
		System.out.println("Ile większych:" + IleWiekszych(a, 4));
		System.out.println("Wypisz podzielne");
		WypiszPodzielne(a,5);
	}

}
