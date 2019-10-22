

import javax.swing.JOptionPane;

public class ConstructionCalcOptions {
  
    
  public static void main(String[] args) { 
    //input data
    JOptionPane.showMessageDialog(null,"Witaj w firmie remontowej. Kalkulator pomoże wyliczyć koszt remontu pomieszczenia.");
    String szerSt = JOptionPane.showInputDialog ("Podaj wymiar długości pomieszczenia:");
    double szer = Double.parseDouble(szerSt);
    String dlugSt = JOptionPane.showInputDialog ("Podaj wymiar szerokości pomieszczenia:");
    double dlug = Double.parseDouble(dlugSt);
    String wysSt = JOptionPane.showInputDialog ("Podaj wysokość pomieszczenia. (standard:2.50)","2.50");
    double wys = Double.parseDouble(wysSt);
    double total =0;
    //math
    double sciany = ((szer * wys) + (dlug * wys))*2;
    double sufit = (szer * dlug);
    double powMal = sciany+sufit;
    double listwy = (2*szer + 2*dlug);
    //prices
    double cenGips = 30;
    double cenMal = 15;
    double cenPanel = 20;
    double cenListwy = 10;
    //zakladamy ze sufit tez gipsujemy
    double wycenaGips = powMal*cenGips;
    double wycenaMal = powMal*cenMal;
    double wycenaLis = listwy*cenListwy;
    double wycenaPanele= sufit*cenPanel;
    //double total = wycenaGips + wycenaMal+wycenaLis + wycenaPanele;
    
    int gipsInput = JOptionPane.showConfirmDialog(null, 
                "Czy chcesz gipsować ściany? :", "Wybierz opcję:",JOptionPane.YES_NO_CANCEL_OPTION);
    if (gipsInput ==0) {total +=wycenaGips;};
      System.out.println(total);
      int malInput = JOptionPane.showConfirmDialog(null, 
                "Czy chcesz malować ściany? :", "Wybierz opcję:",JOptionPane.YES_NO_CANCEL_OPTION);
      if (malInput ==0) {total +=wycenaMal;};
      System.out.println(total);
      int paneleInput = JOptionPane.showConfirmDialog(null, 
                "Czy chcesz połozyć panele? :", "Wybierz opcję:",JOptionPane.YES_NO_CANCEL_OPTION);
      if (paneleInput ==0) {total +=wycenaPanele;};
        System.out.println(total);
      int listwyInput = JOptionPane.showConfirmDialog(null, 
                "Czy chcesz położyć listwy? :", "Wybierz opcję:",JOptionPane.YES_NO_CANCEL_OPTION);
      if (listwyInput ==0) {total +=wycenaLis;};
           System.out.println(total);
          JOptionPane.showMessageDialog(null," Całkowity koszt remontu to: "+total + " PLN");
  }
  
  
  
}
