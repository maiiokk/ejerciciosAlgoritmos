package ej21;

import java.util.Scanner;

public class ej21 {

	public static void main(String[] args) throws InterruptedException {

		int i = 35;

		while (i <= 100) {
			System.out.println("temperatura " + i + "°");

			i += 2;
			
			if(i<85) { 
			Thread.sleep(20);
			}
			if(i>85) { 
				Thread.sleep(200);
			}
			
			if (i == 85) {
				System.out.println("CUIDADO!! TEMPERATURA PELIGROSA");
				Thread.sleep(1000);
			}
			if (i == 101) {
				System.out.println("VALOR EXTREMO!!");
				System.out.println("APAGANDO\r\n PC.");

			}
		}

	}
}