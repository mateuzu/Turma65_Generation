package aula5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<Integer>();
		Integer num;

		System.out.println("Digite 10 números não repetidos: ");
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			setNumeros.add(num);
		}

		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = sc.nextInt();

		if (setNumeros.contains(num) == true) {
			System.out.println("\nO número: " + num + " foi encontrado!");
		} else {
			System.out.println("\nO número: " + num + " não foi encontrado");
		}

		sc.close();
	}

}
