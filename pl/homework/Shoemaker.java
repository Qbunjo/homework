import java.util.Scanner;

//class Translate{
  //switch (dayofWeek){

class Shoemaker {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
    System.out.println("Witaj u szewca");
    int dayofWeek=0;
    do {
        System.out.println("Podaj dzień tygodnia, w którym oddałeś buty (1-7) :");
        dayofWeek = scan.nextInt();
          if (dayofWeek >7){
          System.out.println("Błąd: Tydzień ma 7 dni! ");
          }
        } 
        while (dayofWeek >7);
    


    System.out.println("Jak długo ma trwać naprawa? (ilość dni) :");
    int RepairTime = scan.nextInt();
    int Pickup = dayofWeek + RepairTime;
    while (Pickup > 7){
    Pickup -=7;
    }
    System.out.println("Dzień odbioru: "+ Pickup);

   

  }
}
