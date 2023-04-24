package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche= new Coche();
		micoche.establece_color();//forma de aseder a un gettre o setter
		System.out.println(micoche.dime_color());
		Coche lasruedas=new Coche();
		lasruedas.dime_ruedas();
		System.out.println(lasruedas.dime_ruedas());
		
	}

}
