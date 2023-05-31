package aula2;

import java.util.Scanner;

public class ExercicioSwitchCase3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod;
		float x, y, total;
		
		System.out.print("Digite o 1° número: ");
		x = sc.nextFloat();
		System.out.print("Digite o 2° número: ");
		y = sc.nextFloat();
		System.out.print("Operação: ");
		cod = sc.nextInt();
		
		switch(cod) {
		case 1:
			total = x + y;
			System.out.println("\n" + x + " + " + y + " = " + total);
			break;
		case 2:
			total = x - y;
			System.out.println("\n" + x + " - " + y + " = " + total);
			break;
		case 3:
			total = x * y;
			System.out.println("\n" + x + " * " + y + " = " + total);
			break;
		case 4:
			total = x / y;
			System.out.println("\n" + x + " / " + y + " = " + total);
			break;
		default:
			System.out.println("\nOperação inválida!");
		}
		
		sc.close();
	}

}
