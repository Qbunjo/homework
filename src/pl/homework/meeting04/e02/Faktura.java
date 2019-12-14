package pl.homework.meeting04.e02;

import java.util.ArrayList;
import java.util.List;

public class Faktura {
	private String numer;
	private String towar;
	private int ilosc;
	private Double cena;
	private int vat;
	
	public List<Faktura> lista = new ArrayList<>();

	public Faktura(String numer, String towar, int ilosc, Double cena, int vat) {
		
	}
	public void dodajPozycje(String towar, int ilosc, double cena, int vat) {
		Faktura pozycja = new Faktura(numer,towar, ilosc, cena,vat);
		lista.add(numer,towar,ilosc,cena,vat);
	}

	public int iloscPozycji(String numer) {
		
		int ilosc=lista.size();;
		return ilosc;
	}

	public double wartoscPozycji(String numer, int numerPozycji) {
		Double wartosc = cena*vat*ilosc;
		return wartosc;
	}
	public double doZaplaty() {
		return 0;
		
	};
	public void wydrukuj(){
		for (int i=0; i==lista.size();i++) {
			System.out.println("drukuj wszystko");	
		}
		
	}
}
