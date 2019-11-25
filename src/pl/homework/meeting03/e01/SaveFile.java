package pl.homework.meeting03.e01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.List;

public class SaveFile {

	public static void save(List<Ogloszenie> anonList,String filePath) throws FileNotFoundException {
		try {
			PrintWriter out = new PrintWriter(filePath+"ogloszenia.csv");
			// PrintWriter out = new PrintWriter("/home/patryk/Pulpit/nowy_plik.txt");

			System.out.println("File for save found.");

			for (Ogloszenie anounce : anonList) {
				out.println(anounce);
				
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		System.out.println("File saved.");
	}

}
