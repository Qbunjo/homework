package pl.homework.meeting03.e01;

import java.io.File;
import java.util.List;

public class TestOgloszenie {

	public static void main(String[] args) {

		File plik = new File(
					"C:\\Users\\Jakuboslaw\\eclipse-workspace\\git\\src\\main\\java\\pl\\homework\\meeting03\\e01\\ogloszenia.csv");

		// OgloszenieNieruchomosci ogln1= new OgloszenieNieruchomosci(null, 0, 0);

		List<Ogloszenie> lista2 = LoadFile.readFile(plik);
	
		for (Ogloszenie model : lista2) {
			System.out.println(model.toString());
		}

	}

}
