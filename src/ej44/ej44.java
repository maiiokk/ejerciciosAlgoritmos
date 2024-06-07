package ej44;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ej44 {

	public static void main(String[] args) {
		
        System.out.println("Se registrarán equipos de fútbol.");
        
        
        Set<String> equipos = new HashSet<>();
        
       
        Scanner scanner = new Scanner(System.in);
        String equipo;
        do {
            System.out.print("Ingrese un equipo de fútbol (o escriba 'fin' para terminar): ");
            equipo = scanner.nextLine();
            if (!equipo.equalsIgnoreCase("fin")) {
                equipos.add(equipo);
            }
        } while (!equipo.equalsIgnoreCase("fin"));
        
        
        System.out.println("\nEquipos ingresados:");
        for (String e : equipos) {
            System.out.println(e);
        }
        System.out.println("Cantidad de equipos ingresados: " + equipos.size());
	}

}
