package pl.homework.meeting03.e01;

public class TestOgloszenie {

	public static void main(String[] args) {
		OgloszenieSamochodowe oglo1=new OgloszenieSamochodowe("Nówka Fiacik", null, 0, null, null, null, 0, 0, 0, 0, null, false);
		OgloszenieSamochodowe oglo2=new OgloszenieSamochodowe("Sprzedam Opla", null, 0, null, null, null, 0, 0, 0, 0, null, false);
		//OgloszenieNieruchomosci ogln1= new OgloszenieNieruchomosci(null, 0, 0);
		
		String druk=oglo1.toString();
		System.out.println(druk);
		druk=oglo2.toString();
		System.out.println(druk);

	}

}
