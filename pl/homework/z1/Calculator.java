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
        Integer result = null;
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

                int element1 = Integer.parseInt(arguments[0]);
                int element2 = Integer.parseInt(arguments[1]);
                result = element1 + element2;

            } else if (expr.contains("-")) {
                System.out.println("odejmowanie");
                String[] arguments = expr.split("-");

                int element1 = Integer.parseInt(arguments[0]);
                int element2 = Integer.parseInt(arguments[1]);
                result = element1 - element2;
            } else if (expr.contains("*")) {
                System.out.println("mnozenie");
                String[] arguments = expr.split("\\*");

                int element1 = Integer.parseInt(arguments[0]);
                int element2 = Integer.parseInt(arguments[1]);
                result = element1 * element2;
            } else if (expr.contains("/")) {
                System.out.println("dzielenie");
                String[] arguments = expr.split("/");

                int element1 = Integer.parseInt(arguments[0]);
                int element2 = Integer.parseInt(arguments[1]);
                result = element1 / element2;
            } else {
                System.out.println("Błąd: Nieprawidłowe działanie");
            }
            System.out.println("Wynik: " + expr + "=" + result);
        }
    }

}
