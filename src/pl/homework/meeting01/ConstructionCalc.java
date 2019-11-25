package pl.homework.meeting01;

import javax.swing.JOptionPane;

public class ConstructionCalc {
  
  
  public static void main(String[] args) { 
    JOptionPane.showMessageDialog(null,"Witaj w firmie remontowej. Kalkulator pomoże wyliczyć koszt remontu pomieszczenia.");
    String szerSt = JOptionPane.showInputDialog ("Podaj wymiar długości pomieszczenia:");
    double szer = Double.parseDouble(szerSt);
    String dlugSt = JOptionPane.showInputDialog ("Podaj wymiar szerokości pomieszczenia:");
    double dlug = Double.parseDouble(dlugSt);
    String wysSt = JOptionPane.showInputDialog ("Podaj wysokość pomieszczenia. (standard:2.50)","2.50");
    double wys = Double.parseDouble(wysSt);
    //math
    double sciany = ((szer * wys) + (dlug * wys))*2;
    double sufit = (szer * dlug);
    double powMal = sciany+sufit;
    double listwy = (2*szer + 2*dlug);
    double cenGips = 30;
    double cenMal = 15;
    double cenPanel = 20;
    double cenListwy = 10;
    //zakladamy ze sufit tez gipsujemy
    double wycenaGips = powMal*cenGips;
    double wycenaMal = powMal*cenMal;
    double wycenaLis = listwy*cenListwy;
    double wycenaPanele= sufit*cenPanel;
    double total = wycenaGips + wycenaMal+wycenaLis + wycenaPanele;
    
    JOptionPane.showMessageDialog(null," Całkowity koszt remontu (gipsowanie, malowanie, panele i listwy) to: "+total + " PLN");
  }
  
  
  
}
