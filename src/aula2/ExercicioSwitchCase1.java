package aula2;

import java.util.Scanner;

public class ExercicioSwitchCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod, quant;
		float total;
		
		System.out.println("Olá, seja bem vindo à lanchonete dos malucos!");
		System.out.print("Informe o código do produto: ");
		cod = sc.nextInt();
		
		switch(cod) {
		case 1:
			System.out.print("Informe a quantidade: ");
			quant = sc.nextInt();
			System.out.println("\nProduto: Cachorro Quente");
			total = quant * 10.00f;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 2:
			System.out.print("Informe a quantidade: ");
			quant = sc.nextInt();
			System.out.println("\nProduto: X-Salada");
			total = quant * 15.00f;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 3:
			System.out.print("Informe a quantidade: ");
			quant = sc.nextInt();
			System.out.println("\nProduto: X-Bacon");
			total = quant * 18.00f;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 4:
			System.out.print("Informe a quantidade: ");
			quant = sc.nextInt();
			System.out.println("\nProduto: Bauru");
			total = quant * 12.00f;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 5:
			System.out.print("Informe a quantidade: ");
			quant = sc.nextInt();
			System.out.println("\nProduto: Refrigerante");
			total = quant * 8.00f;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		case 6:
			System.out.print("Informe a quantidade: ");
			quant = sc.nextInt();
			System.out.println("\nProduto: Suco de laranja");
			total = quant * 13.00f;
			System.out.printf("Valor total: R$ %.2f", total);
			break;
		default:
			System.out.println("\nProduto inválido!");
		}
		
		sc.close();
	}

}
