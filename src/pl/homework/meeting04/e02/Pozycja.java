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

	public static  void DodajPozycje(String numer, String towar, int ilosc, Double cena, int vat) {
		Pozycja pozycja = new Pozycja(numer, towar, ilosc, cena, vat);
		Faktura.lista.add(pozycja);
	}

	public static  int iloscPozycji() {

		int ilosc = Faktura.lista.size();

		return ilosc;
	}

	public  Double WartoscPozycji(int numerPozycji) {
		int i=0;
		double total=0.00;;
		for (Pozycja pozycja:Faktura.lista) {
			if (numerPozycji==i) {
			total+=getCena()*(1+(getVat()/100)*getIlosc()); break;}
			i++;
		}// this does not work because test does not accept non-static methods
		return total;
			}

	public Double DoZaplaty() {
		Double total=0.00;
		for (Pozycja pozycja:Faktura.lista) {
			total+=getCena()*(1+(getVat()/100)*getIlosc());
		}// this does not work because test does not accept non-static methods
		return total;

	};

	public void Wydrukuj() {
		for (Pozycja pozycja:Faktura.lista) {
			System.out.println(Faktura.lista);
			//it does not print list, but its address in memory
		}

	}

	

	public String getNumer() {
		return numer;
	}

	public void setNumer(String numer) {
		this.numer = numer;
	}

	public String getTowar() {
		return towar;
	}

	public void setTowar(String towar) {
		this.towar = towar;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

	public Double getCena() {
		return cena;
	}

	public void setCena(Double cena) {
		this.cena = cena;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	@Override
	public String toString() {
		return "Pozycja [numer=" + numer + ", towar=" + towar + ", ilosc=" + ilosc + ", cena=" + cena + ", vat=" + vat
				+ "]";
	}

	

}
