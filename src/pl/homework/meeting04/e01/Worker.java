package pl.homework.meeting04.e01;

public class Worker {
	private int stawka;
	private int czas;
	private int nadgodziny;
	int over = 0;
	int regular = 0;

	public Worker(int stawka) {
		this.stawka = stawka;

	}

	public void praca(int czas) {
		
		
	}
	
	public void wyplata() {
		if (czas > 8) {
			over = czas - 8;
			over = stawka * over * 2;
			regular = 8 * stawka;
		} else {
			regular = czas * stawka;
		}

		stawka = regular + over+stawka;

	}
	

	public int getStawka() {
		return stawka;
	}

	public void setStawka(int stawka) {
		this.stawka = stawka;
	}

	public int getCzas() {
		return czas;
	}

	public void setCzas(int czas) {
		this.czas = czas;
	}

	public int getNadgodziny() {
		return nadgodziny;
	}

	public void setNadgodziny(int nadgodziny) {
		this.nadgodziny = nadgodziny;
	}

}
