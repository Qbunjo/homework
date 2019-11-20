package pl.homework.meeting03.e01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SaveFile {

	public void Save(List<Ogloszenie>anonList) throws FileNotFoundException {
		try {
			PrintWriter out = new PrintWriter("ogloszenia2.csv");
			// PrintWriter out = new PrintWriter("/home/patryk/Pulpit/nowy_plik.txt");

			System.out.println("File succesfully opened for save.");

			for (Ogloszenie anounce : anonList) {
				out.println(anounce);
				out.close();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

			// for (Ogloszenie announce : announces)
			// pw.println(Ogloszenie.toString());

		}
	}
}
