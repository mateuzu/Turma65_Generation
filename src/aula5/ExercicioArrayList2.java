package aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		Integer num;
		
		System.out.println("Entre com 10 números inteiros: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(": ");
			num = sc.nextInt();
			numeros.add(num);
		}
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		num = sc.nextInt();
		
		if (numeros.contains(num)) {
			System.out.println("\nO número " + num + " existe e está na posição: " + numeros.indexOf(num));
		} else {
			System.out.println("\nO número " + num + " não foi encontrado");
		}
		
		sc.close();
	}

}
