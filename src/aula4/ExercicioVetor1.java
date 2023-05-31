package aula4;

import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int vet[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, x, posicao = -1;
		
		System.out.print("Digite o número que você deseja encontrar: ");
		x = sc.nextInt();
		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == x) {
				posicao = i;
			}
		}
		
		if (posicao >= 0) {
			System.out.print("O número " + x + " existe e está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + x + " não foi encontrado!");
		}
		
		sc.close();
	}

}
