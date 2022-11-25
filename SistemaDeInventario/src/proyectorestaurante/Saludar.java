package proyectorestaurante;

public class Saludar extends Mesero{
	public Saludar() {
		this.getNombre();
		this.getNombreRestaurante();
	}
	//POLIMORFISMO
	public void decirAlgo() {
		System.out.println("Hola, bienvenido a " + this.getNombreRestaurante() + ". \nLe atiende: " + this.getNombre() + ". \n Que desea ordenar? \n");
	}
}
