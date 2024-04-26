package utilidades;

import persona.Persona;
import persona.PersonaData;

public class ValidadorPersona {

	public static boolean isValid(Persona p) {
		
		if(	(p.getPeso()>=PersonaData.PESO_MIN) &&
			(p.getPeso()<=PersonaData.PESO_MAX) &&
			(p.getEdad()>=PersonaData.EDAD_MIN) &&
			(p.getEdad()<=PersonaData.EDAD_MAX) &&
			(p.getAltura()>=PersonaData.ALTURA_MIN) &&
			(p.getAltura()<=PersonaData.ALTURA_MAX)) {
			
			return true;
		}
		return false;
	}

}