package pl.homework.meeting04.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class FakturaTest {

		
	@Test void NowaFaktura() {
		Faktura nowa= new Faktura();
		List<Pozycja> actual = nowa.getLista();
		assertEquals(0, actual.size());
		//new invoice is empty
	}
	
	@Test void dodajPozycje() {
		Faktura nowa = new Faktura();
		nowa.DodajPozycje("12/3","Lodowka",2,3.40,23);
		nowa.DodajPozycje("12/3","Pralka",2,3.40,23);				 
		assertEquals(2, nowa.iloscPozycji());
	}

	@Test
	void ilePozycji() {
		Faktura nowa = new Faktura();
		nowa.DodajPozycje("12/3","Lodowka",2,3.40,23);
		nowa.DodajPozycje("12/3","Pralka",2,3.40,23);	
		nowa.DodajPozycje("12/3","Pralka2",2,3.40,23);	
		nowa.DodajPozycje("12/3","Pralka3",2,3.40,23);	
		assertEquals(4, nowa.iloscPozycji());
	}
	
	@Test
	void testWartoscPozycji() {
		Faktura nowa = new Faktura();
			nowa.DodajPozycje("12/3","Zmywarka",4,1240.40,23);
		
			Double total=nowa.WartoscPozycji(1);
			assertEquals(12,total);
	}
	@Test
	void testdoZaplaty() {
		Faktura nowa = new Faktura();
			nowa.DodajPozycje("12/3","Zmywarka",4,1240.40,23);
			nowa.DodajPozycje("12/3","Pralka",2,3.40,23);	
			nowa.DodajPozycje("12/3","Pralka2",2,3.40,23);	
		//	Double total=nowa.DoZaplaty();
		//assertEquals(23,total);
	}
	@Test		
	void testWydrukuj() {
			Faktura nowa = new Faktura();
			nowa.DodajPozycje("12/3","Zmywarka",4,1240.40,23);
			nowa.DodajPozycje("12/5","Pralka",2,1000.40,23);
			nowa.Wydrukuj();
	}
	}

