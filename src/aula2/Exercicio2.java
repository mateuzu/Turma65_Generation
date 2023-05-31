package aula2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
			
		if (num > 0 && num % 2 == 0) {
			System.out.println("\nO número " + num + " é par e positivo!");
		} else if (num < 0 && num % 2 != 0) {
			System.out.println("\nO número " + num + " é ímpar e negativo!");
		} else if (num < 0 && num % 2 == 0) {
			System.out.println("\nO número " + num + " é par e negativo!");
		} else {
			System.out.println("\nO número " + num + " é ímpar e positivo!");
		}
		
		sc.close();

	}

}
