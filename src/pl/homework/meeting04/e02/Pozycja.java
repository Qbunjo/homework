package pl.homework.meeting04.e02;

public class Pozycja extends Faktura {
	private String numer;
	private String towar;
	private int ilosc;
	private Double cena;
	private int vat;
	
	public Pozycja(String numer, Double wartosc) {
		super(numer, wartosc);
		this.numer=numer;
		this.towar=towar;
		this.ilosc=ilosc;
		this.cena=cena;
		this.vat=vat;
	}

}
