package proyectorestaurante;
public class Menu extends Platillos {


public void header() {
	System.out.println("---------------------------------------------------------");
	System.out.println("------------------------ M E N U ------------------------|");
}
	
	
public static double SacarIva(double subtotal) {
		double IVA= (subtotal*0.15);
		 System.out.println("|  IVA 15% : ------------------- " +  String.format("%.2f",(IVA)));
		   return IVA;
	}
	
	public static double propina(double subtotal) {
		Mesero mes1 = new Mesero();
		double propina=(subtotal*0.05);
		System.out.println("|  Propina de "+ mes1.getNombre() +" es de: ---- "+propina);
		return propina;
	}
	
}
	



