package pl.homework.meeting04.e02;

import java.util.ArrayList;
import java.util.List;

public class Faktura {
	private List<Pozycja> lista;

	public Faktura() {
		this.lista = new ArrayList<>();

	}

	public List<Pozycja> getLista() {
		return lista;
	}

	public void DodajPozycje(String numer, String towar, int ilosc, Double cena, int vat) {
		Pozycja pozycja = new Pozycja(numer, towar, ilosc, cena, vat);
		lista.add(pozycja);
	}

	public int iloscPozycji() {

		int ilosc = lista.size();

		return ilosc;
	}

	public  Double WartoscPozycji(int numerPozycji) {
		int i=0;
		double total=0.00;;
		for (Pozycja pozycja: lista) {
			if (numerPozycji==i+1) {
				Pozycja szukanaPozycja = lista.get(i);
				total+= szukanaPozycja.getCena()*(1+(szukanaPozycja.getVat()/100)*szukanaPozycja.getIlosc());
				break;
			}
			i++;
		}
		return total;
	}

	public Double DoZaplaty() {
		Double total=0.00;
		for (Pozycja pozycja: lista) {
			total+= pozycja.getCena()*(1+(pozycja.getVat()/100)*pozycja.getIlosc());
		}
		return total;

	};

	public void Wydrukuj() {
		System.out.println(lista);

	}

}
