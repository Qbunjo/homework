package pl.homework.meeting03.e01;

public class Ogloszenie {
 private String tytul;
 private String opis;
 private int cena;
 private String kontakt;
 
 public Ogloszenie() {
	 
 }

public Ogloszenie(String tytul, String opis, int cena, String kontakt) {
	this.tytul = tytul;
	this.opis = opis;
	this.cena = cena;
	this.kontakt = kontakt;
}

public String getTytul() {
	return tytul;
}

public void setTytul(String tytul) {
	this.tytul = tytul;
}

public String getOpis() {
	return opis;
}

public void setOpis(String opis) {
	this.opis = opis;
}

public int getCena() {
	return cena;
}

public void setCena(int cena) {
	this.cena = cena;
}

public String getKontakt() {
	return kontakt;
}

public void setKontakt(String kontakt) {
	this.kontakt = kontakt;
}

@Override
public String toString() {
	return "Ogloszenie [tytul:" + tytul + ", opis:" + opis + ", cena:" + cena + ", kontakt:" + kontakt + "]";
}
 
 
 
}
