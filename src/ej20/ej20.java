package ej20;

public class ej20 {

	public static void main(String[] args) throws InterruptedException {

		int i = 0;

		do {
			i++;
			System.out.println(i + " Seguidores");
			Thread.sleep(20);
			if (i == 100) {
				System.out.println("META ALCANZADA, FELICIDAES!! ");

			}
		} while (i < 100);

	}
}
