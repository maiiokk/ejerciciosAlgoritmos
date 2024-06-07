package ej45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ej45 {

	public static void main(String[] args) {

		class PaisesSudamericanos {

		}

		List<String> paisesSudamericanos = new ArrayList<>();

		paisesSudamericanos.add("Argentina");
		paisesSudamericanos.add("Bolivia");
		paisesSudamericanos.add("Brasil");
		paisesSudamericanos.add("Chile");
		paisesSudamericanos.add("Colombia");
		paisesSudamericanos.add("Ecuador");
		paisesSudamericanos.add("Guyana");
		paisesSudamericanos.add("Paraguay");
		paisesSudamericanos.add("Perú");
		paisesSudamericanos.add("Surinam");
		paisesSudamericanos.add("Uruguay");
		paisesSudamericanos.add("Venezuela");

		Collections.sort(paisesSudamericanos);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nombre de un país: ");
		String paisIngresado = scanner.nextLine();

		if (paisesSudamericanos.contains(paisIngresado)) {
			System.out.println(paisIngresado + " es un país sudamericano.");
		} else {
			System.out.println(paisIngresado + " no es un país sudamericano.");
		}

		System.out.println("\nLista de países sudamericanos ordenada alfabéticamente:");
		for (String pais : paisesSudamericanos) {
			System.out.println(pais);
		}

	}

}
