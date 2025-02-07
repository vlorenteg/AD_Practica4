package es.studium.AD_practica4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	public static void main(String[] args) {
		// Abrimos el contenedor de Inversión de Control (IoC) de Spring
        // Esto carga los beans definidos en el archivo beans.xml
		ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		
		// Obtener instancias de Persona a partir de los beans definidos en beans.xml
        // Estas instancias ya tienen asignados los valores desde el XML
		Persona persona1 = appContext.getBean("persona1", Persona.class);
		Persona persona2 = appContext.getBean("persona2", Persona.class);
		Persona persona3 = appContext.getBean("persona3", Persona.class);

		
		// Obtener instancias de Habitacion desde beans.xml
		Habitacion habitacion1 = appContext.getBean("salon", Habitacion.class);
		// Asignamos manualmente a persona2 como ocupante de la habitación "salón"
		habitacion1.setPersona(persona2);
		
		Habitacion habitacion2 = appContext.getBean("cocina", Habitacion.class);
		// Asignamos manualmente a persona1 como ocupante de la habitación "cocina"
		habitacion2.setPersona(persona1);
		
		Habitacion habitacion3 = appContext.getBean("baño", Habitacion.class);
		// Asignamos manualmente a persona1 como ocupante de la habitación "baño"
		habitacion3.setPersona(persona1);
		
		// Crear una lista y añadir los objetos de tipo Habitacion a la lista
		// Lo podemos hacer o bien através del código, o bien en la definición del bean 'casa'
		// dentro de la etiqueta <list>, haciendo la referencia a cada habitación
		List<Habitacion> habitaciones = new ArrayList<Habitacion>();
		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);
		habitaciones.add(habitacion3);
		
		// Obtener un bean 'casa' y establecer valores de los atributos
		Casa casa1 = appContext.getBean("casa", Casa.class);
		casa1.setPropietario(persona3);
		casa1.setHabitaciones(habitaciones); 
		
		 // Imprimimos la información de la casa, llamando al método toString() de la clase Casa
		System.out.println(casa1);
		// Cerrar el contexto
		((ClassPathXmlApplicationContext) appContext).close();
	}
}