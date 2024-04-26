package utilidades;

import persona.Persona;
import persona.PersonaData;

public class FactoryPersona {

	public static Persona getPersona(String nombre) throws Exception {
		
		Persona p = new Persona();
		
		p.setNombre(nombre);
		int edad = (int)(Math.random()*100);
		if(edad<=PersonaData.EDAD_MIN || edad>=PersonaData.EDAD_MAX) {
			throw new Exception("Edad no valida");
		}
		p.setEdad(edad);

		int peso = (int)(Math.random()*101);
		if(peso<=PersonaData.PESO_MIN || peso>=PersonaData.PESO_MAX) {
			throw new Exception("PESO no valido");
		}
		p.setPeso(peso);

		int altura = (int)(Math.random()*201);
		p.setAltura(altura);
		if(altura<=PersonaData.ALTURA_MIN || altura>=PersonaData.ALTURA_MAX) {
			throw new Exception("ALTURA no valida");
		}
		
		return p;
	}

}