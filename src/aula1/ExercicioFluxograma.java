package aula1;

import java.util.Scanner;

public class ExercicioFluxograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite o sálario: ");
		float salario = sc.nextFloat();
		System.out.print("Digite o abono: ");
		float abono = sc.nextFloat();
		
		sc.close();
		
		float novoSalario = salario + abono;
		System.out.printf("\nNovo salário: %.2f", novoSalario);
	}

}
