package ogloszenie;

public class OgloszenieNieruchomosci extends Ogloszenie {
	
	

	private String miejscowosc;
	private double metraz;
	private int liczbaPokoi;

	public OgloszenieNieruchomosci(String tytul, String opis, int cena, String kontakt,String miejscowosc, double metraz, int liczbaPokoi) {
		super(tytul,opis,cena,kontakt);
		this.miejscowosc = miejscowosc;
		this.metraz = metraz;
		this.liczbaPokoi = liczbaPokoi;
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

	public OgloszenieNieruchomosci(String miejscowosc, double metraz, int liczbaPokoi) {
		super();
		this.miejscowosc = miejscowosc;
		this.metraz = metraz;
		this.liczbaPokoi = liczbaPokoi;
	}

	@Override
	public String toString() {
		return "OgloszenieNieruchomosci [Tytuł: "+ getTytul() + ", Opis:" + getOpis() + ", Cena:" + getCena()+ 
				", Kontakt:" + getKontakt()+"miejscowosc=" + miejscowosc + ", metraz=" + metraz + ", liczbaPokoi="
				+ liczbaPokoi +  "]";
	}


	}




