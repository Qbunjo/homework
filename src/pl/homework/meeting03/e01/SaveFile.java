package pl.homework.meeting03.e01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

public class SaveFile {

	public static void save(List<Ogloszenie> anonList,String filePath) {
		URL url = SaveFile.class.getClassLoader().getResource(filePath);
		String absolutePath = url.getPath();
		try {

			PrintWriter out = new PrintWriter(absolutePath);

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
