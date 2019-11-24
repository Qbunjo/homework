package pl.homework.meeting03.e01;

import java.util.List;

public class TestOgloszenie {

	private static final String CSV_FILE_PATH = "pl/homework/meeting03/e01/ogloszenia.csv";

	public static void main(String[] args) {

		List<Ogloszenie> list2 = new LoadFile().readFromFile(CSV_FILE_PATH);

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
		new SaveFile().save(list2, CSV_FILE_PATH);
	}

}
