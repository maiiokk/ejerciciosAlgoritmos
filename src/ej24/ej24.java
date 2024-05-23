package ej24;

import java.util.Scanner;

public class ej24 {

	public static void main(String[] args) throws InterruptedException {

		Scanner data = new Scanner(System.in);

		float numero1, numero2, suma;
		int salir;
		boolean quiereSalir = false;

		System.out.println("Buen día, Vamos a sumar dos numeros.");

		do {

			System.out.println("Ingrese un numero: ");
			numero1 = data.nextInt();

			System.out.println("Ingrese otro numero: ");
			numero2 = data.nextInt();

			suma = numero1 + numero2;

			Thread.sleep(500);

			System.out.println("El resultado de la suma es: " + suma);

			Thread.sleep(500);

			System.out.println("Para salir, presione 0. Si no, ingrese cualquier otro numero.");
			salir = data.nextInt();

			if (salir == 0) {
				quiereSalir = true;
			} else {
				quiereSalir = false;
			}

			Thread.sleep(500);

		} while (quiereSalir == false);

		Thread.sleep(500);

		System.out.println("Programa finalizado.");

	}
}
