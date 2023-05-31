package aula4;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[10];
		float media, soma = 0.0f; 
		
		System.out.println("Esperando a entrada de dados...");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		System.out.println("\nEntrada de dados finalizada!");
		
		System.out.println("\nElementos nos indices ímpares: ");
		for (int i = 0; i < vet.length; i++) {
			if (i % 2 != 0) {
				System.out.print(vet[i] + " ");
			}
		}
		
		System.out.println("\n\nElementos pares: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}
		
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		System.out.printf("\n\nSoma: %.0f", soma);
		
		media = soma / 10;
		System.out.printf("\n\nMédia: %.2f", media);
		
		sc.close();
	}

}
