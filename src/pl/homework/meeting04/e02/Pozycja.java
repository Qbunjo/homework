package pl.homework.meeting04.e02;

import java.util.List;

public class Pozycja {
	private String numer;
	private String towar;
	private int ilosc;
	private Double cena;
	private int vat;

	public Pozycja(String numer, String towar, int ilosc, Double cena, int vat) {
		this.numer = numer;
		this.towar = towar;
		this.ilosc = ilosc;
		this.cena = cena;
		this.vat = vat;
	}

	public static void dodajPozycje(String numer, String towar, int ilosc, Double cena, int vat) {
		Pozycja pozycja = new Pozycja(numer, towar, ilosc, cena, vat);
		Faktura.lista.add(pozycja);
	}

	public static int iloscPozycji() {

		int ilosc = Faktura.lista.size();

		return ilosc;
	}

	public Double wartoscPozycji(int numerPozycji) {

		Double wartosc = cena * (1 + (vat / 100)) * ilosc;
		return wartosc;
	}

	public Double doZaplaty() {
		Double total=0.00;
		for (Pozycja pozycja:Faktura.lista) {
			total+=getCena()*(1+(getVat()/100)*getIlosc());
		}
		return total;

	};

	public void wydrukuj() {
		for (Pozycja pozycja:Faktura.lista) {
			System.out.println(Faktura.lista);
			//it does not print list, but its address in memory
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

	@Override
	public String toString() {
		return "Pozycja [numer=" + numer + ", towar=" + towar + ", ilosc=" + ilosc + ", cena=" + cena + ", vat=" + vat
				+ "]";
	}

}
