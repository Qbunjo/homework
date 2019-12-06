package pl.homework.meeting04.e01;

public class Worker {
	private int stawka;
	private int czas;
	int over = 0;
	int regular = 0;
	int przeprac = 0;
	int zapczas;

	public Worker(int stawka) {
		this.stawka = stawka;

	}

	public void praca(int czas) {
		zapczas += czas;

	}

	public int wyplata() {
		czas = zapczas;
		if (czas > 8) {
			over = czas - 8;
			over = stawka * over * 2;
			regular = 8 * stawka;
		} else {
			regular = czas * stawka;
		}

		przeprac = regular + over;
		czas = 0;
		zapczas = 0;
		return przeprac;
	}

	public int getStawka() {
		return stawka;
	}

	public int getCzas() {
		return czas;
	}

	public int getPrzeprac() {
		return przeprac;
	}

	public int getZapczas() {
		return zapczas;
	}
}
