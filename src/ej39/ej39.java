package ej39;

import java.util.Scanner;

public class ej39 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		Meses mesIngresado = null;
		String ingresoDatos; 
		
	System.out.println("Ingresar un mes: ");
	ingresoDatos = datos.nextLine().toUpperCase();
	
	mesIngresado= Meses.valueOf(ingresoDatos);
	
		
	switch (mesIngresado) {
	case ENERO:
	case MARZO:
	case MAYO:
	case JULIO:
	case AGOSTO:
	case OCTUBRE:
	case DICIEMBRE:
		System.out.println("El mes ingresado tiene 31 dias. ");
		break;
		
	case ABRIL:
	case JUNIO:
	case SEPTIEMBRE:
	case NOVIEMBRE:
		System.out.println("El mes ingresado tiene 30 dias. ");
		break; 
		
	case FEBRERO: 
		System.out.println("El mes ingresado tiene 28 dias. ");
		break; 
		
	default:
		break;
	} 
	
	
	   
	}

}
