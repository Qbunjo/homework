import java.math.BigInteger;
import java.util.Scanner;

public class Silnia3 {

	static BigInteger silnia(int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {

			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj argument:");
		int n = sc.nextInt();

		BigInteger wynik = silnia(n);
		System.out.println("Wynik: " + wynik);
		sc.close();
	}

}
