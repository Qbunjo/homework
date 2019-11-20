package pl.homework.meeting03.e01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadFile {

	private static final String CSV_SEPARATOR = ",";

	public static List<Ogloszenie> readFile(File plik) {
		List<Ogloszenie> lista = new ArrayList<>();

		try (Scanner sc = new Scanner(plik)) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] chunks = line.split(CSV_SEPARATOR, 13);

				int id = Integer.parseInt(chunks[0]);
				// first sign differentiates the announcements
				switch (id) {
				case 1:
					int price = Integer.parseInt(chunks[3]);
					int yearOfPr = Integer.parseInt(chunks[7]);// int
					int mileage = Integer.parseInt(chunks[8]);// int
					double engineCapac = Double.parseDouble(chunks[9]);// double
					int hp = Integer.parseInt(chunks[10]);// int
					boolean damaged = Boolean.parseBoolean(chunks[12]);

					// let's create a car announcement!
					OgloszenieSamochodowe announce = new OgloszenieSamochodowe(chunks[1], // title
							chunks[2], // descript
							price, chunks[4], // contact
							chunks[5], // model
							chunks[6], // brand
							yearOfPr, // year
							mileage, engineCapac, hp, chunks[11], // fuel
							damaged);
					lista.add(announce);
					System.out.println("Loaded car announcement succesfully.");
					break;
				case 2:
					int cena2 = Integer.parseInt(chunks[3]);
					double measures = Double.parseDouble(chunks[6]);
					int rooms = Integer.parseInt(chunks[7]);
					int floors = Integer.parseInt(chunks[8]);

					// let's create estate announcement!
					OgloszenieNieruchomosci announce2 = new OgloszenieNieruchomosci(chunks[1], // title
							chunks[2], // descript
							cena2, chunks[4], // contact
							chunks[5], // city
							measures, rooms, floors);
					lista.add(announce2);
					System.out.println("Loaded estate announcement succesfully.");
					break;
				default:
					System.out.println("Error:Unknown type of announcement read! Skipping entry.");
					break;
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return lista;
	}
}
