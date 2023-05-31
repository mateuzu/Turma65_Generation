package aula2;

import java.util.Scanner;

public class ExercicioSwitchCase2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int cargo;
		float salario, novoSalario;
		
		System.out.print("Nome do colaborador: ");
		nome = sc.nextLine();
		System.out.print("Cargo: ");
		cargo = sc.nextInt();
		
		switch(cargo) {
		case 1:
			System.out.print("Salário: R$ ");
			salario = sc.nextFloat();
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			novoSalario = salario + (0.10f * salario);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 2:
			System.out.print("Salário: R$ ");
			salario = sc.nextFloat();
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			novoSalario = salario + (0.07f * salario);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 3:
			System.out.print("Salário: R$ ");
			salario = sc.nextFloat();
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			novoSalario = salario + (0.09f * salario);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 4:
			System.out.print("Salário: R$ ");
			salario = sc.nextFloat();
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			novoSalario = salario + (0.06f * salario);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 5:
			System.out.print("Salário: R$ ");
			salario = sc.nextFloat();
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			novoSalario = salario + (0.05f * salario);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		case 6:
			System.out.print("Salário: R$ ");
			salario = sc.nextFloat();
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			novoSalario = salario + (0.08f * salario);
			System.out.printf("Salário: R$ %.2f", novoSalario);
			break;
		default:
			System.out.println("\nOpção inválida!");
		}
		
		sc.close();
	}

}
