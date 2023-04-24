package poo;

public class Prueba {
	public static void main(String[]args) {
		
		Empleados Trabajador1 = new Empleados("paco");
		Empleados Trabajador2 = new Empleados("ana");
		Empleados Trabajador3 = new Empleados("antonio");
		Empleados Trabajador4 = new Empleados("maria");
		
	     trabajador1.cambiaSeccion("RRHH");
	 
	 System.out.println(Trabajador1.devuelveDatos());
	 System.out.println(Trabajador2.devuelveDatos());
	 System.out.println(Trabajador3.devuelveDatos());
	 System.out.println(Trabajador4.devuelveDatos());
	 
	 System.out.println(Empleados.dameIdSiguiente());
	 
     	
	}

}

class Empleados{
	public Empleados(String nom) {
		nombre = nom;
		seccion = "administracion";
		Id = IdSiguiente;
		
		IdSiguiente++;
	}
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	public String devuelveDatos(){
		return "el nombre es:" + nombre + "la seccion es " + seccion + "y el Id=" + Id;
		
		
			
	}
	public static String dameIdSiguiente() {
		return "el IdSiguiente es :"+ IdSiguiente;
		
	}
	
	private final String nombre;
	private String seccion;
	private  int Id;
	private static int IdSiguiente=1;
	
	}
		