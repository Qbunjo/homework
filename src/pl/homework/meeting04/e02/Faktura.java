package pl.homework.meeting04.e02;

import java.util.ArrayList;
import java.util.List;

public class Faktura {
	private List lista;
	private String numer;
	private String towar;
	private int ilosc;
	private Double cena;
	private int vat;

	public Faktura(List lista) {
		this.lista = lista;

	}

	public class Pozycja {
		public Pozycja(String numer2, String towar2, int ilosc2, Double cena2, int vat2) {
			// TODO Auto-generated constructor stub
		}
		private String numer;
		private String towar;
		private int ilosc;
		private Double cena;
		private int vat;
	}

	public void Pozycja(String numer, String towar, int ilosc, Double cena, int vat) {
		this.numer=numer;
		this.towar=towar;
		this.ilosc=ilosc;
		this.cena=cena;
		this.vat=vat;
	}

	public void dodajPozycje(String numer, String towar, int ilosc, Double cena, int vat) {
		Pozycja pozycja = new Pozycja(numer,towar,ilosc,cena,vat);
		lista.add(pozycja);
	}

	public int iloscPozycji(String numer) {

		int ilosc = lista.size();
		;
		return ilosc;
	}

	public double wartoscPozycji(String numer, int numerPozycji) {
		Double wartosc = cena * vat * ilosc;
		return wartosc;
	}

	public double doZaplaty() {
		return 0;

	};

	public void wydrukuj() {
		for (int i = 0; i == lista.size(); i++) {
			System.out.println("drukuj wszystko");
		}

	}

	public String getNumer() {
		return numer;
	}

	public String getTowar() {
		return towar;
	}

	public int getIlosc() {
		return ilosc;
	}

	public Double getCena() {
		return cena;
	}

	public int getVat() {
		return vat;
	}

	

}
