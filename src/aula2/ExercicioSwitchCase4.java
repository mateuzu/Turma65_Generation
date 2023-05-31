package aula2;

import java.util.Scanner;

public class ExercicioSwitchCase4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cod;
		float saldo = 1000.00f, saque, deposito;
		
		System.out.print("Operação: ");
		cod = sc.nextInt();
		
		switch(cod) {
		case 1:
			System.out.println("\nOperação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.println("\nOperação - Saque");
			System.out.print("Valor: R$ ");
			saque = sc.nextFloat();
			if (saldo < saque) {
				System.out.println("Saldo insuficiente!");
			} else {
				saldo -= saque;
				System.out.printf("Novo saldo: R$ %.2f", saldo);
			}
			break;
		case 3:
			System.out.println("\nOperação - Deposito");
			System.out.print("Valor: R$ ");
			deposito = sc.nextFloat();
			saldo += deposito;
			System.out.printf("Novo saldo: R$ %.2f", saldo);
			break;
		default:
			System.out.println("\nOperação inválida");
		}
		
		sc.close();
	}

}
