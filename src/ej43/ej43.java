package ej43;

import java.util.Scanner;

public class ej43 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int[] numeros = { 1011, 2367, 8748, 9121, 817, 6423, };
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

		System.out.println("\nNombres y números de socio de personas con números de socio impares:");
		
		for (int i = 0; i < nombre.length; i++) {
			if (numeros[i] %2 != 0) {

				System.out.println("Numero: " + numeros[i]);
				System.out.println("Nombre: "+ nombre[i]);
				System.out.println("--------------------");
				x = true;
			}
			
		}
		if (x == false) {
			System.out.println("Ese codigo no existe, mal ahi. ");

		}
		
		
	}
}