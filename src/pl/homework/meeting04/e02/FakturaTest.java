package pl.homework.meeting04.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class FakturaTest {

	@Test
	void NowaFaktura() {
		Faktura nowa = new Faktura("34.12.2019");
		List<Pozycja> actual = nowa.getLista();
		assertEquals(0, actual.size());
		// new invoice is empty
	}

	@Test
	void dodajPozycje() {
		Faktura nowa = new Faktura("12");
		nowa.DodajPozycje("Lodowka", 2, 3.40, 23);
		nowa.DodajPozycje("Pralka", 2, 3.40, 23);
		assertEquals(2, nowa.iloscPozycji());
	}

	@Test
	void ilePozycji() {
		Faktura nowa = new Faktura("12");
		nowa.DodajPozycje("Lodowka", 2, 3.40, 23);
		nowa.DodajPozycje("Pralka", 2, 3.40, 23);
		nowa.DodajPozycje("Pralka2", 2, 3.40, 23);
		nowa.DodajPozycje("Pralka3", 2, 3.40, 23);
		assertEquals(4, nowa.iloscPozycji());
	}

	@Test
	void testWartoscPozycji() {
		Faktura nowa = new Faktura("12");
		nowa.DodajPozycje("Zmywarka", 4, 1240.40, 23);

		Double total = nowa.WartoscPozycji(1);
		assertEquals(1240.40, total);
	}

	@Test
	void testdoZaplaty() {
		Faktura nowa = new Faktura("12");
		nowa.DodajPozycje("Zmywarka", 4, 1240.40, 23);
		nowa.DodajPozycje("Pralka", 2, 1100.80, 23);
		nowa.DodajPozycje("Pralka2", 2, 2400.25, 23);
		Double total = nowa.DoZaplaty();
		assertEquals(11963.70, total);
	}

	@Test
	void testWydrukuj() {
		Faktura nowa = new Faktura("12");
		nowa.DodajPozycje("Zmywarka", 4, 1240.40, 23);
		nowa.DodajPozycje("Pralka", 2, 1000.40, 23);
		nowa.Wydrukuj();
		
	}
}
