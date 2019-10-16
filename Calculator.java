package homework;
//public class add
//public class subtract
//public class multiply
//public class divide
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Witaj. Kalkulator");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Wpisz dzialanie:");
            String expr = scan.nextLine();
            //System.out.println(expr);
            if (expr.contains("koniec"))// this doesnt work - why?
            {break;}
            //here we will parse the variable into three subvariables
            //double a = Double.parseDouble(expr[0]);
            //string mark = String.parseString (expr[1]);
            //double b = Double.parseDouble(expr[2]);
            //switch (mathExpr){
            //case "+" :
            //run add method;
            //break;
            //case "-" :
            //run subtract method;
            //break;
            //case "*" :
            //run multiply method;
            //break;
            //case "/" :
            //run divide method;
            //break
            // default:
            // System.out.println ("Wpisz poprawne działanie ! (+-*/) ");
            //}
            //System.out.println ("Wynik" + expr + "= "+ result);
        };
    }
}
