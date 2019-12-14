package pl.homework.meeting04.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class FakturaTest {

		
	@Test void NowaFaktura() {
		Faktura nowa= new Faktura(null);
		assertEquals(0, Faktura.lista.size());
		//new invoice is empty
	}
	
	@Test void dodajPozycje() {
		Faktura nowa = new Faktura(null);
		Pozycja.DodajPozycje("12/3","Lodowka",2,3.40,23);
		Pozycja.DodajPozycje("12/3","Pralka",2,3.40,23);				 
		assertEquals(2, Pozycja.iloscPozycji());
	}

	@Test
	void ilePozycji() {
		Faktura nowa = new Faktura(null);
		Pozycja.DodajPozycje("12/3","Lodowka",2,3.40,23);
		Pozycja.DodajPozycje("12/3","Pralka",2,3.40,23);	
		Pozycja.DodajPozycje("12/3","Pralka2",2,3.40,23);	
		Pozycja.DodajPozycje("12/3","Pralka3",2,3.40,23);	
		assertEquals(4, Pozycja.iloscPozycji());
	}
	
	@Test
	void testWartoscPozycji() {
		Faktura nowa = new Faktura(null);
			Pozycja.DodajPozycje("12/3","Zmywarka",4,1240.40,23);
		
			Double total=Pozycja.WartoscPozycji(1);
			assertEquals(12,total);
	}
	@Test
	void testdoZaplaty() {
		Faktura nowa = new Faktura(null);
			Pozycja.DodajPozycje("12/3","Zmywarka",4,1240.40,23);
			Pozycja.DodajPozycje("12/3","Pralka",2,3.40,23);	
			Pozycja.DodajPozycje("12/3","Pralka2",2,3.40,23);	
		//	Double total=Pozycja.doZaplaty();
		//assertEquals(23,total);
	
	}
	}

