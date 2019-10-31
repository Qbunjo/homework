//package pl.homework.z2;

import java.util.Scanner;

public class Fibonacci {

    static long FiNumber(int cyfra)
    {
        if (cyfra == 0) {
            return 0;
        }
        if (cyfra == 1) {
        return 1;
    }// pierwszym argumentem, od którego liczymy jest 2, a 1+2=3, toteż p=3
        long p=3;
        for (int i=2; i == cyfra; i++){
        p += (i+1);
            System.out.println(p);

    }
        return p;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program oblicza kolejną liczbę ciągu Fibonacciego");
        System.out.println("Którą liczbę ciągu chcesz obliczyć?:");

        int InpNum = sc.nextInt();
        FiNumber(InpNum);


    }
