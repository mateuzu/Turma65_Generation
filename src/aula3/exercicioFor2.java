package aula3;

import java.util.Scanner;

public class exercicioFor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, contPar = 0, contImpar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "° número: ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
		}
		
		System.out.println("\nTotal de números pares: " + contPar);
		System.out.println("Total de números ímpares: " + contImpar);
		sc.close();
	}

}
