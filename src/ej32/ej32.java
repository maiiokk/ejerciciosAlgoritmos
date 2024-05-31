package ej32;

import java.util.Scanner;

public class ej32 {

	public static void main(String[] args) {
		
	Scanner dato=new Scanner (System.in);
	
	int num; 
	int resul; 
	
	System.out.println("Ingresar un dato: ");
	num=dato.nextInt();
	
	for (int i = 1; i <= 20; i++) {
	    
		resul = num * i;
		System.out.println(num + " * " + i + " = " + resul);
	}

	}

}
