package ej48;
import java.util.Scanner;

public class ej48 {

	

	public static void main(String[] args) {
		int[] arr = new int[3];
	
		int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        int n1 = arr.length;
        for (int i = 0; i < n1-1; i++) {
            for (int j = 0; j < n1-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números de DNI:");
        int cantidad = scanner.nextInt();
        
        int[] dni = new int[cantidad];
        System.out.println("Ingrese los números de DNI:");
        for (int i = 0; i < cantidad; i++) {
            dni[i] = scanner.nextInt();
        }
		
        
		
		
		
	}

}
