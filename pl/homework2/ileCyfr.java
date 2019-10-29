package homework2;

import java.util.Scanner;

public class ileCyfr {

	static int liczCyfry(long wybor) {
		String policz = String.valueOf(wybor);
		int p= policz.length();
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj mi jakąś liczbę:");
		long wybor = sc.nextLong();
		System.out.println("Liczba cyfr:" + liczCyfry(wybor));
		sc.close();
	}

}
