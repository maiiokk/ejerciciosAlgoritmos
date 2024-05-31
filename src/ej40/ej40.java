package ej40;

public class ej40 {

	public static void main(String[] args) throws InterruptedException {
		
		String[] nombre = {"Messi", "Maradona", "Aymar", "Gallardo", "Palermo", "Riquelme", "Vagoneta", "Eito", "Leybovich", "Raffo"};

		for (String nombresVariable : nombre) {
			System.out.println("El nombre es: "+ nombresVariable);
			Thread.sleep(100);
		}
		
//		for (int i = 0; i < nombre.length ; i++) {
//			System.out.println("El nombre es: " +nombre[i]);
//		}
//		
	}

}
