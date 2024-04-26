package main;

import java.util.List;

import persona.Persona;
import utilidades.ClonadorPersonas;

public class Start {

	public static void main(String[] args) {

		ClonadorPersonas cp = new ClonadorPersonas("Marcos");
		List<Persona> personas = cp.generarClones();
		System.out.println(personas);

	}

}