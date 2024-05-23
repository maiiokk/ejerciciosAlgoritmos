package ej14;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {

		Scanner data = new Scanner(System.in);
		float numero1, numero2, division;

		System.out.println("ingresa un numero");
		numero1 = data.nextInt();

		System.out.println("ingresa otro numero");
		numero2 = data.nextInt();

		if (numero2 != 0) {
			division = numero1/numero2;
			System.out.println("El resultado es: "+division);
		}
		else {
			System.err.println("No se puede dividir por cero");
		}
	}

}
