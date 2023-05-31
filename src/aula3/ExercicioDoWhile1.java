package aula3;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, soma = 0;
		
		System.out.println("Digite 0 para interromper o programa:\n");
		
		do {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			if (num > 0) {
				soma += num;
			}
		} while (num != 0);
		
		System.out.println("\nPrograma encerrado, resultados:");
		System.out.println("A soma dos números positivos é: " + soma);
		sc.close();
	}

}
