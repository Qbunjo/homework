package pl.homework.meeting03.e02;


public class Main {

	public static void main(String[] args) {
		
				FuelStation station1= new FuelStation("StatOil", 3.40,2.50,3.20);
				FuelStation station2= new FuelStation("Stacja BP", 3.30,3.2,4.3);
				FuelStation station3=new FuelStation("Orlen", 2.30,4.30,3.40);
				FuelStation station4= new FuelStation("Stacja Ziutka", 2.40,3.34,5.43);
				
				//przed tankowaniem
				System.out.println(station1.toString());
				station1.FillIn("ON", 20.0);
				//po tankowaniu
				System.out.println(station1.toString());
}
		}

