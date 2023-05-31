package aula3;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int idade = 0, contMaior = 0, contMenor = 0;
		
		System.out.println("Digite uma idade negativa para interromper o programa!\n");
		while (idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			if (idade < 21 && idade > 0) {
				contMenor++;
			} else if (idade > 50) {
				contMaior++;
			}
		}
		
		System.out.println("\nPrograma encerrado, resultados:");
		System.out.println("Total de pessoas menores de 21 anos: " + contMenor);
		System.out.println("Total de pessoas maiores que 50 anos: " + contMaior);
		
		sc.close();
	}

}
