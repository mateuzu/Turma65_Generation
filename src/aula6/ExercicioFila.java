package aula6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<>();
		int opção;
		String cliente;
		
		System.out.println("Menu: " + ""
				+ "\n********************************************"
				+ "\n*\t1 - Adicionar Cliente na fila      *"
				+ "\n*\t2 - Listar todos os Clientes       *"
				+ "\n*\t3 - Retirar Cliente da fila        *"
				+ "\n*\t0 - Sair                           *"
				+ "\n********************************************");
		System.out.print("\nEntre com a opção desejada: ");
		opção = sc.nextInt();
	
		while (opção != 0) {
			switch(opção) {
			case 1:
				System.out.print("Entre com o nome do cliente: ");
				cliente = sc.next();
				clientes.add(cliente);
				System.out.println("O Cliente: " + cliente + " foi adicionado a fila!");
				break;
			case 2:
				if (clientes.isEmpty()) {
					System.out.println("\nNenhum cliente na fila no momento!");
				} else {
					System.out.println("Lista de clientes na fila: " + clientes.toString().replaceAll("[\\[\\]]", ""));
				}
				break;
			case 3:
				if (clientes.isEmpty()) {
					System.out.println("A fila está vazia no momento!");
				} else {
					System.out.println("O cliente " + clientes.poll() + " foi chamado!");
					System.out.println("Lista de clientes atualizada: " + clientes.toString().replaceAll("[\\[\\]]", ""));
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
		
		System.out.println("\nClientes restantes na fila: ");
		if (clientes.isEmpty()) {
			System.out.println("Não restou nenhum cliente na fila!");
		} else {
			for (String client : clientes) {
				System.out.println("° " + client);
			}
		}
		
		sc.close();
	}

}
