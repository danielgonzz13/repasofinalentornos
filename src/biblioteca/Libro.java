package biblioteca;
/*
 * Examen parcial 12-11-2024 hecho por Daniel González Hernández
 */

public class Libro {
	//atributos del libro
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private boolean prestado;
	private int cantidad;
	// variables para los mensajes de prestar y devolver
	private String MensajePrestado;
	private String MensajeDevuelto;
	// metodo constructor
	public Libro(String titulo, String autor, int anioPublicacion, int cantidad) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.cantidad = cantidad;
		this.prestado = false;
	}
	// metodo constructor 2
	public Libro(String titulo, String autor, int anioPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.prestado = false;
		this.cantidad = 10;
	}
	// metodo presar
	public String prestar() {
		if (prestado==true) { // si esta prestado
			MensajePrestado= "El libro ya esta prestado";
		} else { // si el libro no esta prestado
		prestado=true; // el libro pasa a estar prestado
		this.cantidad= cantidad-1; // le quito 1 a la cantidad
		MensajePrestado = "El libro ha sido prestado correctamente";
		}
		return MensajePrestado; // devuelve el mensaje
		}
	// metodo devolver
	public String devolver() {
		if (prestado==false) { // si el libro no esta prestado
			MensajeDevuelto="El libro no esta prestado";
		} else { // si el libro esta prestado 
		prestado=false; // pasa a no prestado
		this.cantidad=cantidad+1; // se devuelve 1 de cantidad 
		MensajeDevuelto = "El libro ha sido devuelto correctamente";
		}
		return MensajeDevuelto; // devuelve el mensaje 
	}
	// metodo para saber si es antiguo o no
	public boolean esAntiguo() {
		if (anioPublicacion<2000) { // si si año de publicacion es mayor al del año 2000
		return true;
		} else // si no es mayor 
			return false;
	}
	// metodo mostrar informacion
	public void mostrarInformacion() {
	System.out.println(titulo+" "+autor+" "+anioPublicacion+" "+prestado);	
	}
	// metodo para actualizar ejemplares
	public void actualizarNumeroEjemplares (int cantidadnueva) {
		if (cantidadnueva>=0) { // si el numero es positivo o mayor que 0
			cantidad=cantidadnueva; // se actualiza la cantidad
		} else // si el numero esta por debajo de 0
			System.err.println("Numero por debajo de 0");
	}
	// metodo para saber si esta disponible el libro
	public boolean estaDisponible() {
		if (prestado==false&&cantidad>0) { // si hay mas de 0 ejemplares y no esta prestado
		return true;
		} else // en caso de que no se cumplan alguna de las 2 condiciones anteriores 
		return false;
		
	}
	// getters y setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	// metodo tostring
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", prestado="
				+ prestado + ", cantidad=" + cantidad + "]";
	}
	
	}
	

