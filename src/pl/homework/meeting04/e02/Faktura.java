package pl.homework.meeting04.e02;

import java.util.ArrayList;
import java.util.List;

public class Faktura {
	
	List <Faktura> lista = new ArrayList<>();

	public Faktura(String numer, Double wartosc) {
		
	}

	public void dodajPozycje(String towar, int ilosc, double cena, int vat) {
		Pozycja pozycja = new Pozycja(towar,ilosc,cena,vat);
		lista.add(pozycja);
	}

	public int iloscPozycji(String numer) {
		
		int ilosc=0;;
		return ilosc;
	}

	public double wartoscPozycji(String numer, int numerPozycji) {
		int wartosc = 0;
		return wartosc;
	}
}
