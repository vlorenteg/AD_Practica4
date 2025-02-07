package es.studium.AD_practica4;

public class Persona {
	
	// Atributos
	private String nombre;

	// Constructor vacío
	public Persona() {
		nombre = "";
	}
	
	// Constructor por parámetros
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Método toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
}
