package pl.homework.meeting03.e01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

public class SaveFile {

	public void save(List<Ogloszenie> anonList, String relativePath) {
		URL url = this.getClass().getClassLoader().getResource(relativePath);
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
