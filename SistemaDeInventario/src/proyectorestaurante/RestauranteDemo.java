package proyectorestaurante;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class RestauranteDemo extends Menu{

	static Scanner entrada = new Scanner(System. in);
	
	
	
	public static void validar() {
		while (!entrada.hasNextInt(16)) {
			entrada.next();
			System.out.println("Digite un numero.");
		}
	}
	

	public static void main(String[] args)throws IOException {
		
		//YOU HAVE TO CHANGE THE URL
		FileWriter facturita = new FileWriter("C:\\Users\\Usuario\\Desktop\\ProyectoFinal(Antes)\\SistemaDeInventario\\bin\\proyectorestaurante.txt");
		
		  int opPlatillo;
		  double subtotal=0;
		  String lista = "";	
		  
		  ArrayList<Platillos> listaMenuPlatillos = new ArrayList<Platillos>();
		  
			Platillos p1 = new Platillos("Dedos de queso ---------------", 60);
			Platillos p2 = new Platillos("Guacamole --------------------", 50);
			Platillos p3 = new Platillos("Papas a la francesa ----------", 40);
			Platillos p4 = new Platillos("Verduras --------------------", 120);
			Platillos p5 = new Platillos("Fideos ----------------------", 100);
			Platillos p6 = new Platillos("Camarones -------------------", 190);
			Platillos p7 = new Platillos("Pollo empanizado ------------", 130);
			Platillos p8 = new Platillos("Hamburguesa / res -----------", 140);
			Platillos p9 = new Platillos("Ensalada Veget --------------", 150);  
			Platillos p10 = new Platillos("Helado Vai/Cho/Fr -----------", 80);
			Platillos p11 = new Platillos("Flan napolitano -------------", 40);
			Platillos p12 = new Platillos("Fresas con crema ------------", 60);  
			Platillos p13 = new Platillos("Naranja ---------------------", 30);
			Platillos p14 = new Platillos("Cacao -----------------------", 50);
			Platillos p15 = new Platillos("Grama -----------------------", 50);
			
			listaMenuPlatillos.add(p1);
			listaMenuPlatillos.add(p2);
			listaMenuPlatillos.add(p3);
			listaMenuPlatillos.add(p4);
			listaMenuPlatillos.add(p5);
			listaMenuPlatillos.add(p6);
			listaMenuPlatillos.add(p7);
			listaMenuPlatillos.add(p8);
			listaMenuPlatillos.add(p9);
			listaMenuPlatillos.add(p10);
			listaMenuPlatillos.add(p11);
			listaMenuPlatillos.add(p12);
			listaMenuPlatillos.add(p13);
			listaMenuPlatillos.add(p14);
			listaMenuPlatillos.add(p15);
			

			Mesero mes1 = new Mesero();
			Menu menu = new Menu();
			Saludar saludo = new Saludar();
			Despedir despe = new Despedir();
			
			 	System.out.println("--------------------------------------------------------");
			 	saludo.decirAlgo();
				System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ \n");
				
				menu.header();
				for (int i = 0; i < listaMenuPlatillos.size(); i++) {
					System.out.println("  "+(i+1+"- ")+listaMenuPlatillos.get(i).getNombrePlatillo()+"----------- "+listaMenuPlatillos.get(i).getPrecio() + " -----|");
				}
			
			do {
			      System.out.println("Seleccione una opcion: ");
			      validar();
			      opPlatillo = entrada.nextInt();
			      
			      switch (opPlatillo) {
				case 1:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(0).getNombrePlatillo() + listaMenuPlatillos.get(0).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(0).getNombrePlatillo() + listaMenuPlatillos.get(0).getPrecio());
					subtotal += listaMenuPlatillos.get(0).getPrecio();
				     break;
				case 2:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(1).getNombrePlatillo() + listaMenuPlatillos.get(1).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(1).getNombrePlatillo() + listaMenuPlatillos.get(1).getPrecio());
					subtotal += listaMenuPlatillos.get(1).getPrecio();
				     break;
				case 3:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(2).getNombrePlatillo() + listaMenuPlatillos.get(2).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(2).getNombrePlatillo() + listaMenuPlatillos.get(2).getPrecio());
					subtotal += listaMenuPlatillos.get(2).getPrecio();
				     break;
				case 4:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(3).getNombrePlatillo() + listaMenuPlatillos.get(3).getPrecio() +"\n";
					System.out.println(listaMenuPlatillos.get(3).getNombrePlatillo() + listaMenuPlatillos.get(3).getPrecio());
					subtotal += listaMenuPlatillos.get(3).getPrecio();
				     break;
				case 5:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(4).getNombrePlatillo() + listaMenuPlatillos.get(4).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(4).getNombrePlatillo() + listaMenuPlatillos.get(4).getPrecio());
					subtotal += listaMenuPlatillos.get(4).getPrecio();
				     break;
				case 6:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(5).getNombrePlatillo() + listaMenuPlatillos.get(5).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(5).getNombrePlatillo() + listaMenuPlatillos.get(5).getPrecio());
					subtotal += listaMenuPlatillos.get(5).getPrecio();
				     break;
				case 7:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(6).getNombrePlatillo() + listaMenuPlatillos.get(6).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(6).getNombrePlatillo() + listaMenuPlatillos.get(6).getPrecio());
					subtotal += listaMenuPlatillos.get(6).getPrecio();
				     break;
				case 8:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(7).getNombrePlatillo() + listaMenuPlatillos.get(7).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(7).getNombrePlatillo() + listaMenuPlatillos.get(7).getPrecio());
					subtotal += listaMenuPlatillos.get(7).getPrecio();
				     break;
				case 9:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(8).getNombrePlatillo() + listaMenuPlatillos.get(8).getPrecio() +"\n" ;
					System.out.println(listaMenuPlatillos.get(8).getNombrePlatillo() + listaMenuPlatillos.get(8).getPrecio());
					subtotal += listaMenuPlatillos.get(8).getPrecio();
				     break;
				     
				  
				case 10:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(9).getNombrePlatillo() + listaMenuPlatillos.get(9).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(9).getNombrePlatillo() + listaMenuPlatillos.get(9).getPrecio());
					subtotal += listaMenuPlatillos.get(9).getPrecio();
				     	break;
				case 11:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(10).getNombrePlatillo() + listaMenuPlatillos.get(10).getPrecio() +"\n" ;
					System.out.println(listaMenuPlatillos.get(10).getNombrePlatillo() + listaMenuPlatillos.get(10).getPrecio());
					subtotal += listaMenuPlatillos.get(10).getPrecio();
						break;
				case 12:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(11).getNombrePlatillo() + listaMenuPlatillos.get(11).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(11).getNombrePlatillo() + listaMenuPlatillos.get(11).getPrecio());
					subtotal += listaMenuPlatillos.get(11).getPrecio();
				     	break;
				case 13:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(12).getNombrePlatillo() + listaMenuPlatillos.get(12).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(12).getNombrePlatillo() + listaMenuPlatillos.get(12).getPrecio());
					subtotal += listaMenuPlatillos.get(12).getPrecio();
				     	break;
				case 14:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(13).getNombrePlatillo() + listaMenuPlatillos.get(13).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(13).getNombrePlatillo() + listaMenuPlatillos.get(13).getPrecio());
					subtotal += listaMenuPlatillos.get(13).getPrecio();
				     	break;
				case 15:
				     System.out.print("Ha seleccionado: ");
				     lista += "|  " + listaMenuPlatillos.get(14).getNombrePlatillo() + listaMenuPlatillos.get(14).getPrecio() + "\n";
					System.out.println(listaMenuPlatillos.get(14).getNombrePlatillo() + listaMenuPlatillos.get(14).getPrecio());
					subtotal += listaMenuPlatillos.get(14).getPrecio();
						break;
				case 16:
					
					//pa ver la horita y la fecha
					LocalTime horaLocal = LocalTime.now();
					LocalDate fechaActual = LocalDate.now();
					
				     System.out.println("---------------------------------------");
					System.out.println("------------ "+ mes1.getNombreRestaurante());
					System.out.println("------------------ " + horaLocal);
					System.out.println("------------------------ " + fechaActual);
					 System.out.println("|  LISTA DE PEDIDO \n"+ lista);
					 System.out.println("|  Subtotal es: ---------------- "+subtotal);
					 double sumaTotal = (subtotal+SacarIva(subtotal)+propina(subtotal));
					 System.out.println("|  El total es: ---------------- "+ sumaTotal );
				     System.out.println("---------------------------------------");
				     System.out.println("---------------------------------------");
				     
				     byte opGenerar;
				     System.out.println("|  1) Generar factura");
				     validar();
				     opGenerar = entrada.nextByte();
				 switch (opGenerar) {
				 case 1: 
						facturita.write("--------------------------------------- \n");
					 	facturita.write("-------- "+ mes1.getNombreRestaurante()+ "\n");
						facturita.write("----------------- " + horaLocal + "\n");
					 	facturita.write("-------------- ----------- " + fechaActual + "\n");
					 	facturita.write("|  LISTA DE PEDIDO \n"+ lista);
					 	facturita.write("|  Subtotal es: ---------------- "+subtotal + "\n");
					 	facturita.write("|  El total es: ---------------- "+ sumaTotal + "\n" );
					 	facturita.write("--------------------------------------- \n");
					 	facturita.write("|  merri crismas end japi niu year \n");
					 	facturita.write("---------------------------------------");
					 	break;
				 	}
				 break;
				}
			} while (opPlatillo != 16|| opPlatillo > 16 || opPlatillo < 1);
		
		  
			System.out.println("Su factura se ha generado con exito");
			System.out.println("---------------------------------------");
			despe.decirAlgo();
			System.out.println("---------------------------------------");
			
		
			facturita.close();
		  entrada.close();
		   }
	}
