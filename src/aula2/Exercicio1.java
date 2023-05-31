package aula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, soma;
		
		System.out.print("Digite o número A: ");
		a = sc.nextInt();
		System.out.print("Digite o número B: ");
		b = sc.nextInt();
		System.out.print("Digite o número C: ");
		c = sc.nextInt();
		soma = a + b;
		
		if (soma > c) {
			System.out.println("\n" + b + " + " + a + " = " + soma + " > " + c);
			System.out.println("A soma de A + B é maior que C");
		} else {
			System.out.println("\n" + b + " + " + a + " = " + soma + " > " + c);
			System.out.println("\nA soma de A + B é menor que C");
		}
		
		sc.close();
	}

}
