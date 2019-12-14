package pl.homework.meeting04.e02;

import java.util.ArrayList;
import java.util.List;

import javax.management.StringValueExp;

public class Faktura {
	static List<Pozycja> lista;

	public Faktura(List<Pozycja> lista) {
		this.lista = new ArrayList<>();

	}

	public List<Pozycja> getLista() {
		return lista;
	}

	public void setLista(List<Pozycja> lista) {
		this.lista = lista;
	}

	

}
