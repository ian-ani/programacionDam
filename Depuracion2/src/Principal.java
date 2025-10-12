import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		
		Coche c = new Coche("Fiat","500","Rojo");
		Coche c2 = new Coche("Audi","A4","Negro");
		Coche c3 = new Coche("Renault","4L","Gris");


		Random aleatorio = new Random();
		int velocidad_nueva1 = aleatorio.nextInt(80);
		int velocidad_nueva2 = aleatorio.nextInt(80);
		int velocidad_nueva3 = aleatorio.nextInt(80);

		// En las variables velocidad_nuevaX hay un número entre el 0 y el 50



		c2.acelera(velocidad_nueva1);
		c3.acelera(velocidad_nueva2);
		c.acelera(velocidad_nueva3);


		System.out.println("----- INFO DE LOS 3 COCHES------");
		System.out.println("-----------------------------");	

		c.pinta();
		c2.pinta();
		c3.pinta();

		// Queremos saber las velocidades en este punto

		 velocidad_nueva1 = aleatorio.nextInt(100);
		 velocidad_nueva2 = aleatorio.nextInt(100);
		 velocidad_nueva3 = aleatorio.nextInt(100);

		 c.frena(velocidad_nueva1);
		 c2.frena(velocidad_nueva2);
		 c3.frena(velocidad_nueva3);

		// Queremos saber las velocidades en este punto
		
		System.out.println("----- INFO DE LOS 3 COCHES------");
		System.out.println("-----------------------------");


		c.pinta();
		c2.pinta();
		c3.pinta();
		
	}

}
