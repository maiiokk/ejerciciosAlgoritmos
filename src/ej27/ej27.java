package ej27;

import java.util.Scanner;

public class ej27 {
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);

		int contraseña = 270308;
		int intentos = 3;
		boolean NoTieneIntentos = false;
		
		do {

			System.out.println("Te quedan: " + intentos + " intentos");
			System.out.println("Ingresa contraseña: ");

			contraseña = datos.nextInt();
			intentos--;
			
			if(intentos == 0) {
				NoTieneIntentos = true;
			}
			
			if (contraseña != 270308 && intentos >0  ) {
				System.out.println("Incorrecta. Volve a intentarlo.");
			}
			
			
			

		} while (contraseña != 270308 && NoTieneIntentos == false);
	    
		
		  if (contraseña == 270308) {
        System.out.println("Contraseña correcta. Ingresando... ");
		}
		  else {
		System.out.println("Bloqueaste la PC.");

		  }	}
}
