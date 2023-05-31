package aula4;

import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double notas[][] = new double[10][4];
		double soma[] = new double[10], media[] = new double[10];
		
		System.out.println("Esperando a entrada de dados...");
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print("Digite a nota do " + (i+1) + "° aluno para o " + (j+1) + "° bimestre: ");
				notas[i][j] = sc.nextDouble();
			}
			System.out.println();
		}
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				soma[i] += notas[i][j];
			}
		}
		
		for (int i = 0; i < notas.length; i++) {
			media[i] = soma[i] / 4;
		}
		
		System.out.println("\nResultados/Médias: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println((i+1) + "° aluno - média: " + String.format("%.1f", media[i]));
		}
		
		sc.close();
	}

}
