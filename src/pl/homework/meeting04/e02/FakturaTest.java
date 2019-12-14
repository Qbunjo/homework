package pl.homework.meeting04.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pl.homework.meeting04.e02.Faktura.Pozycja;

class FakturaTest {

		
	@Test void Faktura() {
		Faktura nowa=new Faktura(null);
		Faktura.dodajPozycje("1","Lodówka",2,233.3,30);
		System.out.println(nowa.getTowar());
	assertEquals("Lodowka", nowa.getTowar());
	}
	
	@Test void dodajPozycje() {
		
	}
	}

