package pl.homework.meeting03.e01;

public class OgloszenieSamochodowe extends Ogloszenie {
	private String model;
	private String marka;
	private int rokProd;
	private int przebieg;
	private double pojemnosc;
	private int moc;
	private String rodzajPaliwa;
	private boolean czyBity;
	


	public OgloszenieSamochodowe(String tytul, String opis, int cena, String kontakt,String model, String marka, int rokProd, int przebieg, double pojemnosc, int moc,
			 String rodzajPaliwa, boolean czyBity) {
		super(tytul,opis,cena,kontakt);
		this.model = model;
		this.marka = marka;
		this.rokProd = rokProd;
		this.przebieg = przebieg;
		this.pojemnosc = pojemnosc;
		this.moc = moc;
		this.rodzajPaliwa = rodzajPaliwa;
		this.czyBity = czyBity;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getMarka() {
		return marka;
	}



	public void setMarka(String marka) {
		this.marka = marka;
	}



	public int getRokProd() {
		return rokProd;
	}



	public void setRokProd(int rokProd) {
		this.rokProd = rokProd;
	}



	public int getPrzebieg() {
		return przebieg;
	}



	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}



	public double getPojemnosc() {
		return pojemnosc;
	}



	public void setPojemnosc(double pojemnosc) {
		this.pojemnosc = pojemnosc;
	}



	public int getMoc() {
		return moc;
	}



	public void setMoc(int moc) {
		this.moc = moc;
	}



	


	public String getRodzajPaliwa() {
		return rodzajPaliwa;
	}



	public void setRodzajPaliwa(String rodzajPaliwa) {
		this.rodzajPaliwa = rodzajPaliwa;
	}

	public boolean getczyBity() {
		return czyBity;
	}



	public void setczyBity(boolean czyBity) {
		this.czyBity = czyBity;
	}



	@Override
	public String toString() {
		return "OgloszenieSamochodowe: Tytuł:" + getTytul() + ", Opis:" + getOpis() + ", Cena:" + 
				+ getCena() + ", Kontakt:" + getKontakt() +" model=" + model + ", marka=" + marka + ", rokProd=" + rokProd + ", przebieg="
				+ przebieg + ", pojemnosc=" + pojemnosc + ", moc=" + moc + ", rodzajPaliwa=" + rodzajPaliwa
				+ ", czyBity=" + czyBity + " ]";
	}


	

	
	
}
