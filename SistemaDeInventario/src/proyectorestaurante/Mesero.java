package proyectorestaurante;
/*
@authors Anders and Oliver AHAHAHAH THERE IS NOT A ERROR 
*/
public class Mesero extends RestauranteDemo{

	private String nombre = "Andres";
	private String nombreRestaurante = "Currucuchitos Restaurant";
	
//getter and setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreRestaurante() {
		return nombreRestaurante;
	}

	public void setNombreRestaurante(String nombreRestaurante) {
		this.nombreRestaurante = nombreRestaurante;
	}
	
	
	@Override
	public String toString() {
		return "Hola, bienvenido a " + nombreRestaurante + ". \nLe atiende: " + nombre + ". \nQue desea ordenar? \n";
	}
	
	
}
