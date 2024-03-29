package pl.homework.meeting03.e02;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<FuelStation> stations = new ArrayList<>();
		FuelStation station1 = new FuelStation("StatOil", 3.40, 2.50, 3.20);
		FuelStation station2 = new FuelStation("Stacja BP", 3.30, 3.2, 4.3);
		FuelStation station3 = new FuelStation("Orlen", 2.30, 4.30, 3.40);
		FuelStation station4 = new FuelStation("Stacja Ziutka", 2.40, 3.34, 5.43);
		stations.add(station1);
		stations.add(station2);
		stations.add(station3);
		stations.add(station4);
		
		// przed uzupelnianiem
		System.out.println(station1.toString());
		station1.FillIn("ON", 20.0);
		// po uzupelnianiu
		System.out.println(station1.toString());

		// tankowanie
		Double toPay = station2.FuelCar("PB", 20.0);
		System.out.println("Car tanked, Payment:" + toPay);

		station2.PrintPrices();

		station3.setPriceLPG(20.0);
		System.out.println(station3.toString());
	}
}
