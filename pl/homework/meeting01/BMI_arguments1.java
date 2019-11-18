package pl.homework.meeting01;

import javax.swing.JOptionPane;

public class BMI_arguments1 {

	public static void main(String[] args) {
		String weight = JOptionPane.showInputDialog("Podaj swoją wagę:");
		double weiNum = Double.parseDouble(weight);
		String height = JOptionPane.showInputDialog("Podaj wzrost w cm:");
		double heiNum = Double.parseDouble(height);
		heiNum = heiNum/100;
		double result = ((weiNum/(heiNum*heiNum)));
		JOptionPane.showMessageDialog(null, "Twoje BMI wynosi: "+result);

	}

}
