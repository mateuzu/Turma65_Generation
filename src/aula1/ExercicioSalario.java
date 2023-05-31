package aula1;

import java.util.Scanner;

public class ExercicioSalario {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário bruto: ");
		salarioBruto = sc.nextFloat();
		System.out.print("Adicional noturno: ");
		adicionalNoturno = sc.nextFloat();
		System.out.print("Horas extras: ");
		horasExtras = sc.nextFloat();
		System.out.print("Descontos: ");
		descontos = sc.nextFloat();
		
		sc.close();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.printf("\nSalário líquido: R$ %.2f", salarioLiquido);

	}

}
