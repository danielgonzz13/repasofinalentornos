package biblioteca;
/**
 * Examen parcial 12-11-2024 hecho por Daniel González Hernández
 */

public class PruebaBiblioteca {
	
	public static void main(String[] args) {
	Libro libro1 = new Libro("Cien anyos de soledad","Gabriel García Márquez", 1967, 1); // creacion de objeto 1
	Libro libro2 = new Libro("El código Da Vinci","Dan Brown", 2003); // creacion de objeto 2
	System.out.println(libro1.prestar());// llamo al metodo prestar 
	libro1.mostrarInformacion(); // llamo al metodo mostrar informacion
	System.out.println(libro2.prestar());// llamo al metodo prestar 
	libro2.mostrarInformacion(); // llamo al metodo mostrar informacion
	System.out.println(libro1.prestar());// llamo al metodo prestar 
	libro1.mostrarInformacion(); // llamo al metodo mostrar informacion
	System.out.println(libro1.devolver()); // llamo al metodo devolver
	libro1.mostrarInformacion(); // llamo al metodo mostrar informacion
	System.out.println(libro2.devolver()); // llamo al metodo devolver 
	libro2.mostrarInformacion(); // llamo al metodo mostrar informacion
	System.out.println(libro1.esAntiguo()); // llamo al metodo esantiguo
	if (libro1.esAntiguo()==true) { // si es antiguo llamando al metodo esantiguo
		System.out.println("El libro es antiguo");
	} else { // si no es antiguo
		System.out.println("El libro no es antiguo");
	}
	System.out.println(libro2.esAntiguo()); // llamo al metodo esantiguo
	if (libro2.esAntiguo()==true) { // si es antiguo llamando al metodo esantiguo
		System.out.println("El libro es antiguo");
	} else { // si no es antiguo
		System.out.println("El libro no es antiguo");
	}
	
	
	
	

}
}
