package pl.homework.meeting04.e02;

import java.util.ArrayList;
import java.util.List;

public class Faktura {
	private String numer;
	private String towar;
	private int ilosc;
	private Double cena;
	private int vat;
	List <Faktura> lista = new ArrayList<>();

	public Faktura(String numer, Double wartosc) {
		
	}

	public void dodajPozycje(String towar, int ilosc, double cena, int vat) {
		Pozycja pozycja = new Pozycja(towar,ilosc,cena,vat);
		lista.add(pozycja);
	}

	public int iloscPozycji(String numer) {
		
		return ilosc;
	}

	public double wartoscPozycji(String numer, int numerPozycji) {
		int wartosc = 0;
		return wartosc;
	}
}
