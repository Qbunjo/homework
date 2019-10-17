import java.util.Scanner;

public class Main {
  static String Translate(int doW) {
    switch (doW) {

    case 1:
      return "Poniedzialek";
    case 2:
      return "Wtorek";
    case 3:
      return "Sroda";
    case 4:
      return "Czwartek";
    case 5:
      return "Piatek";
    case 6:
      return "Sobota";
    case 7:
      return "Niedziela";
    default:
      return "blahblah";
    }
  }

  static Integer DoW2Num(String doW) {
    switch (doW) {

    case "poniedzialek":
      return 1;
    case "wtorek":
      return 2;
    case "sroda":
      return 3;
    case "czwartek":
      return 4;
    case "piatek":
      return 5;
    case "sobota":
      return 6;
    case "niedziela":
      return 7;
    default:
      return 8;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Witaj u szewca");
    int dayofWeek = 0;
    do {
      System.out.println("Podaj dzień tygodnia, w którym oddałeś buty (1-7) :");
      dayofWeek = scan.nextInt();
      if (dayofWeek > 7 || dayofWeek < 1) {
        System.out.println("Błąd: Tydzień ma 7 dni! ");
      }
    } while (dayofWeek > 7 || dayofWeek < 1);
    System.out.println(dayofWeek + " to jest " + Translate(dayofWeek));

    System.out.println("Jak długo ma trwać naprawa? (ilość dni) :");
    int RepairTime = scan.nextInt();
    int Pickup = dayofWeek + RepairTime;
    while (Pickup > 7) {
      Pickup -= 7;
    }

    System.out.println("Dzień odbioru: " + Translate(Pickup));

  }
  }
