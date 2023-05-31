package aula6;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> livros = new Stack<>();
		int opção;
		String livro;
		
		System.out.println(""
				+   "\t\t**************************************" + ""
				+ "\n\t\t* Menu:                              *"
				+ "\n\t\t* 1 - Adicionar livro na pilha       *"
				+ "\n\t\t* 2 - Listar todos os livros         *"
				+ "\n\t\t* 3 - Retirar livro da pilha         *"
				+ "\n\t\t* 0 - Sair                           *"
				+ "\n\t\t**************************************");
		
		System.out.print("\nEntre com a opção desejada: ");
		opção = sc.nextInt();
		
		while (opção != 0) {
			sc.nextLine();
			switch(opção) {
				case 1:
					System.out.print("Digite o nome do livro: ");
					livro = sc.nextLine();
					livros.push(livro);
					System.out.println("\nLivro: " + livro + " adicionado!");
					break;
				case 2:
					if (livros.isEmpty()) {
						System.out.println("Nenhum livro na pilha no momento!");
					} else {
						System.out.println("\nLista de livros na pilha: ");
						for (String book : livros) {
							System.out.println("° " + book);
						}
					}
					break;
				case 3:
					if (livros.isEmpty()) {
						System.out.println("A pilha está vazia no momento!");
					} else {
						System.out.println("O livro: " + livros.pop() + " foi retirado da pilha!");
						System.out.println("\nPilha de livros atualizada: ");
						for (String book : livros) {
							System.out.println("° " + book);
						}
					}
					break;
				default:
					System.out.println("\nOpção inválida, entre com uma das opções presentes no MENU!");
					break;
				}
			System.out.print("\nDigite uma opção: ");
			opção = sc.nextInt();
		}
		
		System.out.println("\n\nPrograma finalizado!");
		System.out.println("\nLivros restantes na pilha: ");
		
		if (livros.isEmpty()) {
			System.out.println("Não restou nenhum livro na pilha!");
		} else {
			for (String book : livros) {
				System.out.println("° " + book);
			}
		}
		
		sc.close();
	}

}
