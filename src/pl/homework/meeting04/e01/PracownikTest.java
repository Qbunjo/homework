package pl.homework.meeting04.e01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PracownikTest {

	@Test
	public void testKonstruktor() {
		Worker p1 = new Worker(100);
		assertEquals(100, 100);
	}

	@Test
	public void testPraca() {
		Worker p1 = new Worker(100);
		Worker p2= new Worker (150);
		p1.praca(8);
		p2.praca(8);
		assertEquals(800, p1.getStawka());
		assertEquals(1200, p2.getStawka());
	}
	@Test
	public void testPracaNadgodziny() {
		Worker p1 = new Worker(100);
		p1.praca(9);
		assertEquals(1000, p1.getStawka());
	}
	@Test
	public void testPracaNadgodziny2() {
		Worker p1 = new Worker(100);
		Worker p2 = new Worker(150);
		p1.praca(10);
		p2.praca(10);
		assertEquals(1200, p1.getStawka());
		assertEquals(1800,p2.getStawka());
	}

	@Test
	public void testWyplata() {

	}
}
