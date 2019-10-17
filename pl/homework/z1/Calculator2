
package homework1;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		System.out.println("Witaj. Kalkulator");
		Scanner scan = new Scanner(System.in);
		Double result = null;
		while (true) {
			System.out.println("Wpisz dzialanie:");
			System.out.println("(>koniec< aby zakonczyc)");
			String expr = scan.nextLine();
			// System.out.println(expr);
			if (expr.contains("koniec")) {
				System.out.println("Koniec programu");
				break;
			}
			if (expr.contains("+")) {
				System.out.println("dodawanie");
				String[] arguments = expr.split("\\+");

				double element1 = Double.parseDouble(arguments[0]);
				double element2 = Double.parseDouble(arguments[1]);
				result = element1 + element2;

			} else if (expr.contains("-")) {
				System.out.println("odejmowanie");
				String[] arguments = expr.split("-");

				double element1 = Double.parseDouble(arguments[0]);
				double element2 = Double.parseDouble(arguments[1]);
				result = element1 - element2;
			} else if (expr.contains("*")) {
				System.out.println("mnozenie");
				String[] arguments = expr.split("\\*");
				double element1 = Double.parseDouble(arguments[0]);
				double element2 = Double.parseDouble(arguments[1]);
				result = element1 * element2;
			} else if (expr.contains("/")) {
				System.out.println("dzielenie");
				String[] arguments = expr.split("/");

				double element1 = Double.parseDouble(arguments[0]);
				double element2 = Double.parseDouble(arguments[1]);
				result = element1 / element2;
			} else {
				System.out.println("Błąd: Nieprawidłowe działanie");
			}
			System.out.println("Wynik: " + expr + "=" + result);
		}
	}
}
