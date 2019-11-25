package pl.homework.meeting03.e01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class TestOgloszenie {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Jakuboslaw\\eclipse-workspace\\JJ01-Podstawy\\src\\homework1\\homework\\src\\pl\\homework\\meeting03\\e01\\";
		// String filePath =
		// "/home/qbunjo/git/homework/src/main/java/pl/homework/meeting03/e01/";
		// linux path (cause I work on both systems)
		File plik = new File(filePath + "ogloszenia.csv");

		List<Ogloszenie> list2 = LoadFile.readFile(plik);

		for (

		Ogloszenie announcement : list2) {
			if (announcement instanceof OgloszenieSamochodowe) {
				System.out.println(((OgloszenieSamochodowe) announcement).showCarAnnounce());
			}
			if (announcement instanceof OgloszenieNieruchomosci) {
				System.out.println(((OgloszenieNieruchomosci) announcement).showEstAnnounce());
			}
		}
		// here we will add the menu to add announcements
		// after adding the entry to the list, it should be saved
		try {
			SaveFile.save(list2, filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("All announcements in my base:");
		for (Ogloszenie oglo : list2) {
			System.out.println(oglo);
		}
		// sorting
		System.out.println("I assume you want to find some cars");
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your maximum price?:");
		int carMax = sc.nextInt();
		System.out.println("What is your minimum price?:");
		int carMin = sc.nextInt();
		System.out.println("sorting");
		for (Ogloszenie car : list2) {
			if (car instanceof OgloszenieSamochodowe & car.getCena() < carMax & car.getCena() > carMin) {
				System.out.println(car);
			}
		}
		sc.close();
	}
}
