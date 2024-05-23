package ej13;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		char talle;
		System.out.println(" Ingresar talle de la remera (S-M-L");
		talle = datos.next().charAt(0);

		if (talle == 'S' || talle == 's') {

			System.out.println(" Quedan 5 remeras");
		} else if (talle == 'M' || talle == 'm') {
			System.out.println(" Quedan 2 remeras");
		} else if (talle == 'L' || talle == 'l') {
			System.out.println(" NO quedan remeras");
		}
		  else {
			  System.out.println(" Talle incorrecto");
		  }
	}
}