package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
		String cor;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite uma cor: ");
			cor = sc.next();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores: ");
		for (String color : cores) {
			System.out.print(color + " ");
		}
		
		Collections.sort(cores);
		
		System.out.println("\n\nOrdenar as cores: ");
		for (String color : cores) {
			System.out.print(color + " ");
		}
		
		sc.close();
	}

}
