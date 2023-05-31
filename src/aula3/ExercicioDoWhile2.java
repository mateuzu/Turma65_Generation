package aula3;

import java.util.Scanner;

public class ExercicioDoWhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cont = 0;
		float media = 0.0f, soma = 0.0f;
		
		System.out.println("Digite 0 para interromper o programa:\n");
		do {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			if (num % 3 == 0 && num != 0) {
				soma += num;
				cont++;
				media = soma / cont;
			}
		}while(num != 0);
		
		System.out.println("\nPrograma encerrado, resultados: ");
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		
		sc.close();
	}

}
