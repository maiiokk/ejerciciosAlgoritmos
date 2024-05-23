package ej15;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in) ;
		  float costo;
		  
		  System.out.println("Ingrese un costo: ");
		  costo = data.nextFloat();
		  
		  if (costo>=15000) {
		  costo = costo*0.9f;
		  System.out.println("Su costo es: "+costo);
		  } else {
			  System.out.println("Su costo normal es: "+costo);
			
		  }
		  
    System.out.println();
	}

}
