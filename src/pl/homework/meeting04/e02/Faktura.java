package pl.homework.meeting04.e02;

import java.util.ArrayList;
import java.util.List;

import javax.management.StringValueExp;

public class Faktura {
	 static List<Pozycja> lista;

	public Faktura(List<Pozycja> lista) {
		this.lista = new ArrayList<>();

	}

	public static List<Pozycja> getLista() {
		return lista;
	}

	public static void setLista(List<Pozycja> lista) {
		Faktura.lista = lista;
	}

	

	

}
