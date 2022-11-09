package unico;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

// Pedir un número y calcular su factorial. Ejemplo: Factorial de 5:  5! = 5 x 4 x 3 x 2 x 1 = 120
		
		int num;
		int factorial;
		int i;
		
// Lee un número mayor o igual que 0
		do {
		System.out.print("Por favor, introduzca un número entero: ");
		num = Integer.parseInt(teclado.nextLine());
		if (num < 0) {
			System.out.println("El número introducido no es correcto.");
			}
		} while (num < 0);
		
// Factorial
		factorial = num;
		if (num == 0) {
		System.out.println("El factorial del " + num + " es 1");
		} else {
			for (i = 1; i < num; i++) {
			factorial *= i;
				}
			System.out.println(num + "! = " + factorial);
		}
	}
}
