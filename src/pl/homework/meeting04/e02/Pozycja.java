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
		return "Pozycja [numer faktury:" + numer + ", towar:" + towar + ", ilosc:" + ilosc + ", cena:" + cena + ", vat:" + vat
				+ "]";
	}

	

}
