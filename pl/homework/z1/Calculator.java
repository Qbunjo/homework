package pl.homework.z1;

import java.util.Scanner;
//static double add (double a){
//return ()}

//static double subtract {
//}

//static double multiply {
//}

//static double divide {
//}

public class Calculator {


	public static void main(String[] args) {
		System.out.println("Witaj. Kalkulator");
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Wpisz dzialanie:");
			System.out.println("(>koniec< aby zakonczyc)");
			String expr = scan.nextLine();
			// System.out.println(expr);
			if (expr.contains("koniec")) {
				System.out.println("Koniec programu");
				break;
			}
			if (expr.contains ("+")){
				System.out.println("dodawanie");
				
			} else if (expr.contains("-")) {
				System.out.println("odejmowanie");
				
			} else if (expr.contains("*")) {
				System.out.println("mnozenie");
				
			}else if (expr.contains("/")) {
				System.out.println("dzielenie");
			} else System.out.println("Błąd: Nieprawidłowe działanie");
						}
			// }
			// System.out.println ("Wynik" + expr + "= "+ result);
		}
		;
	}
