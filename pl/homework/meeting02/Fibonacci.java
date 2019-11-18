
package pl.homework.z2;

 
import java.util.Scanner;

public class Fibonacci {

    static long FiNumber(int cyfra)  {
         long table[] = new long[cyfra+1]; //zawsze tworz tablice o 1 wieksza, zeby (i-2) nie było <0
table[0]=1; 
table[1]=1;
if (cyfra==1 || cyfra==2){
  
  return 1;}
            for (int i=2;i<cyfra;i++){
         table[i]=table[i-2]+table[i-1];
          }
        return table[(cyfra-1)];//bo pierwszy element tablicy ma numer 0
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program oblicza kolejną liczbę ciągu Fibonacciego");
        System.out.println("Który element ciągu chcesz obliczyć?:");

        int InpNum = sc.nextInt();
       
        System.out.println(InpNum + "  element ciągu to:" +FiNumber(InpNum));
    }
    }
