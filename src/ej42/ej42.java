package ej42;

import java.util.Scanner;

public class ej42 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int[] numeros = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };
		String[] nombre = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
		int codigoIng;

		System.out.println("Ingrese el codigo: ");
		codigoIng = datos.nextInt();
		boolean x = false;
		for (int i = 0; i < numeros.length; i++) {

			if (codigoIng == numeros[i]) {
				System.out.println("Su codigo es: " + numeros[i]);
				System.out.println("Y su nombre es: " + nombre[i]);
				x = true;
				break;
			}
		}
		    if (x == false) {
			    System.out.println("Ese codigo no existe, mal ahi. ");
   
		}
	}

}
