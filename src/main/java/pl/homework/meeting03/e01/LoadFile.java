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
				//first sign differentiates the announcements
			switch(id) {	
			case 1:
				int cena=Integer.parseInt(chunks[3]);
				int rokProd = Integer.parseInt(chunks[7]);//int
				int przebieg = Integer.parseInt(chunks[8]);//int
				double pojemnosc = Double.parseDouble(chunks[9]);//double
				int moc = Integer.parseInt(chunks[10]);//int
				boolean bity = Boolean.parseBoolean(chunks[12]);
				
				//let's create a car announcement!
				OgloszenieSamochodowe announce = new OgloszenieSamochodowe(
						chunks[1], //tytul
						chunks[2], //opis
						cena, 
						chunks[4], //kontakt
						chunks[5], //model
						chunks[6], //marka
						rokProd, //rok
						przebieg,
						pojemnosc,
						moc,
						chunks[11],//paliwo
						bity);
				lista.add(announce);
				System.out.println("Loaded car announcement succesfully.");
				break;
			case 2:
				int cena2=Integer.parseInt(chunks[3]);
				double metraz=Double.parseDouble(chunks[6]);
				int liczbaPokoi=Integer.parseInt(chunks[7]);
				int liczbaKondygnacji=Integer.parseInt(chunks[8]);
				OgloszenieNieruchomosci announce2= new OgloszenieNieruchomosci(
						chunks[1],//tytul
						chunks[2],//opis
						cena2,
						chunks[4],//kontakt
						chunks[5],//miejscowosc
						metraz,
						liczbaPokoi,
						liczbaKondygnacji);
				lista.add(announce2);
				System.out.println("Loaded estate announcement succesfully.");
				break;
			default:
					System.out.println("Error:Unknown type of announcement read!");
					break;
				}
						
							}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return lista;
	}

}
