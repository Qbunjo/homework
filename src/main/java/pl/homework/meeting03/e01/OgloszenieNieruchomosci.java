package pl.homework.meeting03.e01;

public class OgloszenieNieruchomosci extends Ogloszenie {
	
	

	private String miejscowosc;
	private double metraz;
	private int liczbaPokoi;
	private int liczbaKondygnacji;

	public OgloszenieNieruchomosci(String tytul, String opis, int cena, String kontakt,String miejscowosc, double metraz, int liczbaPokoi, int liczbaKondygnacji ) {
		super(tytul,opis,cena,kontakt);
		this.miejscowosc = miejscowosc;
		this.metraz = metraz;
		this.liczbaPokoi = liczbaPokoi;
		this.liczbaKondygnacji= liczbaKondygnacji;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public double getMetraz() {
		return metraz;
	}

	public void setMetraz(double metraz) {
		this.metraz = metraz;
	}

	public int getLiczbaPokoi() {
		return liczbaPokoi;
	}

	public void setLiczbaPokoi(int liczbaPokoi) {
		this.liczbaPokoi = liczbaPokoi;
	}



	public int getLiczbaKondygnacji() {
		return liczbaKondygnacji;
	}

	public void setLiczbaKondygnacji(int liczbaKondygnacji) {
		this.liczbaKondygnacji = liczbaKondygnacji;
	}

	@Override
	public String toString() {
		return "OgloszenieNieruchomosci [Tytuł: "+ getTytul() + ", Opis:" + getOpis() + ", Cena:" + getCena()+ 
				", Kontakt:" + getKontakt()+"miejscowosc=" + miejscowosc + ", metraz=" + metraz + ", liczbaPokoi="
				+ liczbaPokoi + " Liczba kondygnacji:" + +liczbaKondygnacji+ "]";
	}


	}




