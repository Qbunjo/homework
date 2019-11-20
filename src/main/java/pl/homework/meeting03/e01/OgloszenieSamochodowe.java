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
		this.rokProd = rokProd;//int
		this.przebieg = przebieg;//int
		this.pojemnosc = pojemnosc;//double
		this.moc = moc;//int
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
		return "1," + getTytul() + "," + getOpis() + "," + 
				+ getCena() + "," + getKontakt() +"," + model + "," + marka + "," + rokProd + ","
				+ przebieg + "," + pojemnosc + "," + moc + "," + rodzajPaliwa
				+ "," + czyBity ;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (czyBity ? 1231 : 1237);
		result = prime * result + ((marka == null) ? 0 : marka.hashCode());
		result = prime * result + moc;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pojemnosc);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + przebieg;
		result = prime * result + ((rodzajPaliwa == null) ? 0 : rodzajPaliwa.hashCode());
		result = prime * result + rokProd;
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
		OgloszenieSamochodowe other = (OgloszenieSamochodowe) obj;
		if (czyBity != other.czyBity)
			return false;
		if (marka == null) {
			if (other.marka != null)
				return false;
		} else if (!marka.equals(other.marka))
			return false;
		if (moc != other.moc)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(pojemnosc) != Double.doubleToLongBits(other.pojemnosc))
			return false;
		if (przebieg != other.przebieg)
			return false;
		if (rodzajPaliwa == null) {
			if (other.rodzajPaliwa != null)
				return false;
		} else if (!rodzajPaliwa.equals(other.rodzajPaliwa))
			return false;
		if (rokProd != other.rokProd)
			return false;
		return true;
	}


	

	
	
}
