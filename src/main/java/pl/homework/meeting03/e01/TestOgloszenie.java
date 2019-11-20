package pl.homework.meeting03.e01;

import java.io.File;
import java.util.List;

public class TestOgloszenie {

	public static void main(String[] args) {

		File plik = new File(
				// "/home/qbunjo/git/homework/src/main/java/pl/homework/meeting03/e01/ogloszenia.csv");
				// //linux path
				"C:\\Users\\Jakuboslaw\\eclipse-workspace\\git\\src\\main\\java\\pl\\homework\\meeting03\\e01\\ogloszenia.csv");

		List<Ogloszenie> list2 = LoadFile.readFile(plik);

		for (

		Ogloszenie announcement : list2) {
			System.out.println(announcement.toString());
		}
		System.out.println(".End List.");
		// here we will add the menu to add announcements
		//after adding the entry to the list, it should be saved
		// save(list);
	}

}
