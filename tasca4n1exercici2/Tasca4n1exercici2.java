package tasca4n1exercici2;

import java.util.Scanner;

public class Tasca4n1exercici2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("introduzca su dni");
		String dni = sc.nextLine();

		CalculoDni carnet = new CalculoDni();

		System.out.println(carnet.calcularLetra(dni));

		sc.close();
		
		int numDni = Integer.parseInt(dni);
		int rezultat = numDni%23;
		System.out.println(rezultat);
	}

}
