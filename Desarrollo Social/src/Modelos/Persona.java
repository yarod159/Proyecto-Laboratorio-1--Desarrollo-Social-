package Modelos;
/*
 * Archivo Persona.java
 */
public class Persona {
	
	// Atributos
	protected String cedula;
	protected String nombre;
	protected String apellido;

	// Constructor por Defecto
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 */
	// Constructor con Parametros (Sobrecarga de Metodo)
	public Persona(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	// Getter y Setter
	public String getCedula() {
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}