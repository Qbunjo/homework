package pl.homework.meeting04.e02;

import java.util.List;

public class Pozycja {
	private String towar;
	private int ilosc;
	private Double cena;
	private int vat;

	public Pozycja( String towar, int ilosc, Double cena, int vat) {
		
		this.towar = towar;
		this.ilosc = ilosc;
		this.cena = cena;
		this.vat = vat;
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
		return "towar:" + towar + ", ilosc:" + ilosc + ", cena:" + cena + ", vat:"
				+ vat + "%";
	}

}
