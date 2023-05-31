package aula1;

import java.util.Scanner;

public class ExercicioDiferenca {

	public static void main(String[] args) {
	
		float n1, n2, n3, n4;
		
		Scanner sc = new Scanner(System.in);		
		System.out.print("Número 1: ");
		n1 = sc.nextFloat();
		System.out.print("Número 2: ");
		n2 = sc.nextFloat();
		System.out.print("Número 3: ");
		n3 = sc.nextFloat();
		System.out.print("Número 4: ");
		n4 = sc.nextFloat();
		
		sc.close();
		
		float calculo = (n1 * n2) - (n3 * n4);
		System.out.print("\nDiferença: " + calculo);
		
	}

}
