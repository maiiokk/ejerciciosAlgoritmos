package ej47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ej47 {

	public static void main(String[] args) {
	
		List<String> listtNombres = new ArrayList<>();

		listtNombres.add("Enrique");
		listtNombres.add("Liliana");
		listtNombres.add("Lucas");
		listtNombres.add("Juan");
		listtNombres.add("Fiorella");
		listtNombres.add("Ariel");
		listtNombres.add("Daiana");

		Collections.sort(listtNombres);
		
		List<Integer> listtCodigo = new ArrayList<>();

		listtCodigo.add(1011);
		listtCodigo.add(2367);
		listtCodigo.add(8748);
		listtCodigo.add(9121);
		listtCodigo.add(817);
		listtCodigo.add(6423);
		listtCodigo.add(2034);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese una opcion: ");
		System.out.println("1. Eliminar");
		System.out.println("2. Modificar");
        	  
		int opcion = entrada.nextInt(); // el usuario esta ingresando una opcion
        	    
        	    
		if(opcion == 1) {
			// ELIMINAR
			System.out.println("Ingrese el numero de socio a borrar: ");
			System.out.println(listtCodigo);
			
			int numeroAborrar = entrada.nextInt();
			int posicionEnLaLista = listtCodigo.indexOf(numeroAborrar);
			
			listtCodigo.remove(posicionEnLaLista);
			
			System.out.println("Listado de numeros de socios: "+listtCodigo);
			System.out.println("Listado de nombres de socios: "+listtNombres);
			
		}  else if (opcion == 2) {
			// MODIFICAR
			System.out.println("Ingresar el numero de socio a modificar: ");
		    System.out.println(listtCodigo);
		    
		    int numeroDeSocioAModificar = entrada.nextInt();
		    int posicionEnLaLista = listtCodigo.indexOf(numeroDeSocioAModificar); 
		    
		    System.out.println("Ingrese el nuevo nombre: ");
		    String nuevoNombre = entrada.next();
		    
		    System.out.println("Ingrese el nuevo numero: ");
		    int nuevoNumero = entrada.nextInt();
		    
		    // set( numero de posicion de la lista , el nuevo dato a modificar)
		    listtNombres.set(posicionEnLaLista, nuevoNombre);
		    listtCodigo.set(posicionEnLaLista, nuevoNumero);
		    
		    System.out.println("Listado de numeros de socios: "+listtCodigo);
		    System.out.println("Listado de nombres de socios: "+listtNombres);
		}
		
		
		System.out.println("Ingrese el numero de socio a buscar: ");
		int codigoIng = entrada.nextInt();
		
		boolean x = false;
		for (int i = 0; i < listtCodigo.size(); i++) {
				// Cuando usamos listas, NO se usa length, sino size()
			
			// Aca abajo tienen un array, no una lista.
			// Array: nombreArray[]
			// Lista: nombreLista (sin corchetes!)
			// Para obtener un elemento de la lista, se usa nombreLista.get()
			// Y como queremos recorrer la lista: nombreLista.get(i) (i es la variable del for
			// que me ayuda a recorrer la lista).
			
			if (codigoIng == listtCodigo.get(i)) {// falta algo todavia
				System.out.println("Su codigo es: " +listtCodigo.get(i)); // aca hay que modificar lo mismo que arriba
				System.out.println("Y su nombre es: " + listtNombres.get(i));
				x = true;
				break;
			}
		}
		    if (x == false) {
			    System.out.println("Ese codigo no existe, mal ahi. ");
   
		}
		
		

	}

}
