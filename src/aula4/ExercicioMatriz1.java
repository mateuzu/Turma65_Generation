package aula4;

import java.util.Scanner;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mat[][] = new int[3][3], somaPrincipal = 0, somaSecundaria = 0;
		
		//entrada de dados
		System.out.println("Esperando a entrada de dados...");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nEntrada de dados finalizada!");
		
		//diagonal principal
		System.out.println("\nElementos da diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		
		//diagonal secundária
		System.out.println("\n\nElementos da diagonal secundária: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][mat.length - i - 1] + " ");
		}
		
		//soma diagonal principal
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == j) {
					somaPrincipal += mat[i][j];;
				}
			}
		}
		System.out.println("\n\nSoma dos elementos da diagonal principal: " + somaPrincipal);
		
		//soma diagonal secundaria
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j == mat[i].length - i - 1) {
					somaSecundaria += mat[i][j];;
				}
			}
		}
		System.out.println("Soma dos elementos da diagonal secundária: " + somaSecundaria);
		
		sc.close();
	}

}
