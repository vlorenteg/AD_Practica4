package es.studium.AD_practica4;

import java.util.ArrayList;
import java.util.List;

// Atributos
public class Casa {
	private String nombreCasa;
	private List<Habitacion> habitaciones;
	private Persona propietario;
	
	// Constructor vacío
	public Casa() {
		nombreCasa = "";
		habitaciones = new ArrayList<Habitacion>();
		propietario = new Persona();
	}

	// Constructor por parámetros
	public Casa(String nombreCasa, List<Habitacion> habitaciones, Persona propietario) {
		this.nombreCasa = nombreCasa;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
	}

	// Getters y Setters
	public String getNombreCasa() {
		return nombreCasa;
	}

	public void setNombreCasa(String nombreCasa) {
		this.nombreCasa = nombreCasa;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	// Método toString
	@Override
	public String toString() {
		return "Casa [nombreCasa=" + nombreCasa + ", habitaciones=" + habitaciones + ", propietario=" + propietario
				+ "]";
	}
}