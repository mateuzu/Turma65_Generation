package aula3;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite o primeiro número do intervalo: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo número do intervalo: ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("\nIntervalo inválido");
		} else {
			for (int i = num1; i < num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		sc.close();
	}

}
