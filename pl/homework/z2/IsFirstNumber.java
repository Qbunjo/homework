package pl.homework.z2;

import java.util.Scanner;

public class Main {

    static boolean IsFirst(long cyfra)  {
      if (cyfra==1){return false;};// nie ma sensu liczyć dla 1, bo liczba pierwsza dzieli się przez tylko siebie i przez 1
  for (int n=2; n<cyfra; n++)//wiec liczymy od 2
  {     if (cyfra % n == 0){
System.out.println("Liczba jest złożona, reszta z dzielenia przez "+n+" wynosi 0");
    return false;};
        
         
          }
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sprawdzmy czy liczba jest pierwsza.");
        System.out.println("Podaj liczbę");

        long InpNum = sc.nextInt();
       
        System.out.println("Liczba "+ InpNum + " jest pierwsza?: " +IsFirst(InpNum));
    }
    }
