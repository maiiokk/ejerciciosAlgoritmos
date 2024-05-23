package ej11;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		
  Scanner data = new Scanner(System.in) ;
  int numero;
  
  
  System.out.println("Ingresa un número");
		numero = data.nextInt();
		
	if( numero > 0) {
		System.out.println("El numero es positivo");
	} else if ( numero < 0) {
      System.out.println("el numero es negativo" );		
	} 
	
	else {
		System.out.println("El numero es 0");
	}
  
  
	}
	
	
}
