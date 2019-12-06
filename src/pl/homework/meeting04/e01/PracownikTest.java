package pl.homework.meeting04.e01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PracownikTest {

	@Test
	public void testKonstruktor() {
		Worker p1 = new Worker(100);
		assertEquals(100, p1.getStawka());
	}

	@Test
	public void testPraca() {
		Worker p1 = new Worker(100);
		Worker p2= new Worker (150);
		p1.praca(10);
		p2.praca(12);
		assertEquals(10, p1.getZapczas());
		assertEquals(12, p2.getZapczas());
	}
	@Test
	public void testPracaNadgodziny() {
		Worker p1 = new Worker(100);
		p1.praca(9);
		p1.wyplata();
		assertEquals(1000, p1.getPrzeprac());
	}
	
	@Test
	public void testPracaTest2() {
		Worker p1 = new Worker(100);
		p1.praca(4);
		p1.praca(4);
		p1.wyplata();
		assertEquals(800, p1.getPrzeprac());
	}
	@Test
	public void testPracaNadgodziny2() {
		Worker p1 = new Worker(100);
		Worker p2 = new Worker(150);
		p1.praca(10);
		p2.praca(10);
		p1.wyplata();
		p2.wyplata();
		assertEquals(1200, p1.getPrzeprac());
		assertEquals(1800, p2.getPrzeprac());
	
	}


}
