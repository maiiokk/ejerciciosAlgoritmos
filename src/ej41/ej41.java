package ej41;

import java.util.Scanner;

public class ej41 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		String[] nombres = new String[11]; 
		int[] edades = new int[11]; 
		
		for (int i = 0; i < 11; i++) {
			System.out.println("Ingrese un nombre:");
			nombres[i] = datos.next();
			
			System.out.println("Ingrese edad:");
			edades[i] = datos.nextInt();
		}
		
		
		for (int i = 0; i < 11; i++) {
			System.out.println("Nombre: "+nombres[i]);
			System.out.println("Edades: "+edades[i]);
		}
		
		
	}

}
