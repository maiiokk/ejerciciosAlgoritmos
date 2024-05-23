package ej16;

import java.util.Scanner;

public class ej16 {

	  public static void main(String[] args) {
	
	Scanner data = new Scanner(System.in) ;
	int hora, minuto, segundo; 
	
	System.out.println("Ingresa una hora: "); 
	       hora = data.nextInt();
    
	 System.out.println("Ingresa un minuto: "); 
	       minuto = data.nextInt();
	       
	 System.out.println("Ingresa un segundo: "); 
	      segundo = data.nextInt();
	      
	 if (hora >=24) {
		System.out.println("La hora supera las 24 horas y se convierte en otro dia");
		} 
	 if (minuto >=60) {
		 System.out.println("El minuto supera los 60 minutos y se convierte en una hora");
	    }
	 if (segundo >=60) {
		 System.out.println("El segundo supera los 60 segundos y se convierte en un minuto");
	    }
	 
	 System.out.println("Hora: "+hora);
	 System.out.println("Minuto: "+minuto);
	 System.out.println("Segundo: "+segundo);
}
}
