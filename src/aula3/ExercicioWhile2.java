package aula3;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade, sexo, categoria;
		int contBack = 0, contFront = 0, contMobile = 0, contFullStack = 0; //contadores
		String resposta = "s";
		
		System.out.print("Deseja visualizar o código correspondente? ");
		char tabela = sc.next().charAt(0);
		tabela = Character.toLowerCase(tabela); //char para minusculo
		switch(tabela) {
		case 's':
			System.out.println("\nSexo: "
					+ "\n 1 - Masculino"
					+ "\n 2 - Feminino"
					+ "\n 3 - Outros");
			System.out.println("\nCategoria:"
					+ "\n 1 - Backend"
					+ "\n 2 - Frontend"
					+ "\n 3 - Mobile"
					+ "\n 4 - FullStack\n");
			System.out.println("Avançando para entrada de dados...\n");
		break;
		default:
			System.out.println("\nAvançando para entrada de dados...\n");
		}
		
		while (resposta.equalsIgnoreCase("s")) {
			System.out.print("\nDigite a idade: ");
			idade = sc.nextInt();
			System.out.print("Digite o sexo: ");
			sexo = sc.nextInt();
			System.out.print("Digite a categoria: ");
			categoria = sc.nextInt();
			System.out.print("\nDeseja continuar (S/N) ");
			resposta = sc.next();
			if (categoria == 1) {
				contBack++;
			}
			if (sexo == 2 && categoria == 2) {
				contFront++;
			}
			if (sexo == 1 && categoria == 3 && idade > 40) {
				contMobile++;
			}
			if (sexo == 2 && categoria == 4 && idade < 30) {
				contFullStack++;
			}
		}
		System.out.println("\nResultados: ");
		System.out.println("Total de pessoas desenvolvedoras Backend: " + contBack);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + contFront);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + contMobile);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + contFullStack);
		
		sc.close();
	}

}
