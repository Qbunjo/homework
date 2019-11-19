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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + liczbaKondygnacji;
		result = prime * result + liczbaPokoi;
		long temp;
		temp = Double.doubleToLongBits(metraz);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((miejscowosc == null) ? 0 : miejscowosc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OgloszenieNieruchomosci other = (OgloszenieNieruchomosci) obj;
		if (liczbaKondygnacji != other.liczbaKondygnacji)
			return false;
		if (liczbaPokoi != other.liczbaPokoi)
			return false;
		if (Double.doubleToLongBits(metraz) != Double.doubleToLongBits(other.metraz))
			return false;
		if (miejscowosc == null) {
			if (other.miejscowosc != null)
				return false;
		} else if (!miejscowosc.equals(other.miejscowosc))
			return false;
		return true;
	}


	}




