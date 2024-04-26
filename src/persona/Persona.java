package persona;

public class Persona {

	private String nombre;
	private int peso;
	private int altura;
	private int edad;

	/**
	 * Contructor con los atributos del objeto
	 * 
	 * @param nombre
	 * @param peso
	 * @param altura
	 * @param edad
	 */
	public Persona(String nombre, int peso, int altura, int edad) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}

	public Persona() {
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "{" + nombre + " <" + peso + "> [" + altura + "] (" + edad + ")}";
	}

}