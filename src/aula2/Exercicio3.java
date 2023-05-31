package aula2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.print("Digite o nome do doador: ");
		nome = sc.nextLine();
		System.out.print("Digite a idade do doador: ");
		idade = sc.nextInt();
		System.out.print("Primeira doação de sangue? ");
		primeiraDoacao = sc.nextBoolean();
		
		if (idade >= 18 && idade <= 59) {
			System.out.println("\n" + nome + " está apto para doar sangue!");
		}
		else if (idade >= 60 && idade <= 69 && primeiraDoacao == true) {
			System.out.println("\n" + nome + " não está apto para doar sangue!");
		}
		else if (idade >= 60 && idade <= 69 && primeiraDoacao == false) {
			System.out.println("\n" + nome + " está apto para doar sangue!");
		}
		else {
			System.out.println("\n" + nome + " não está apto para doar sangue!");
		}
		
		sc.close();

	}

}
