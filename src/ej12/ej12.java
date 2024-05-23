package ej12;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner(System.in) ;
		  int calificacion;
		  
     System.out.println("Ingresa una calificación");{
		 calificacion = data.nextInt();
     }
		 if(calificacion >= 1 && calificacion<=3) {
			 System.out.println("insuficiente");
		 }
		 else if (calificacion > 3 && calificacion<6) {
			 System.out.println("no logrado");
		 }
		 
		 else if (calificacion>=6 && calificacion<=7){
			 System.out.println("suficiente");
		 }
		 
		 else if (calificacion>=8 && calificacion<=9) {
			 System.out.println("notable");
		 }
		 
		 else if (calificacion == 10) {
			 System.out.println("Sobresaliente");
		 }
		 else {
			 System.out.println("Nota incorrecta");
		 }
		 
	}

}
