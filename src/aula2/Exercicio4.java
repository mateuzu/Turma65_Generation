package aula2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String anatomia, classe, ordem;
		
		System.out.print("Informe se o animal é invertebrado ou vertebrado? ");
		anatomia = sc.next();
		System.out.print("Informe a classe do animal: ");
		classe = sc.next();
		System.out.print("Informe a ordem do animal: ");
		ordem = sc.next();
		
		//vertebrados
		if(anatomia.equalsIgnoreCase("vertebrado") && classe.equalsIgnoreCase("ave") && ordem.equalsIgnoreCase("carnivoro")) {
			System.out.println("\nÁguia");
		} else if (anatomia.equalsIgnoreCase("vertebrado") && classe.equalsIgnoreCase("ave") && ordem.equalsIgnoreCase("onivoro")) {
			System.out.println("\nPomba");
		} else if (anatomia.equalsIgnoreCase("vertebrado") && classe.equalsIgnoreCase("mamifero") && ordem.equalsIgnoreCase("onivoro")) {
			System.out.println("\nHomem");
		} else if (anatomia.equalsIgnoreCase("vertebrado") && classe.equalsIgnoreCase("mamifero") && ordem.equalsIgnoreCase("herbivoro")){
			System.out.println("\nVaca");
		} 		
		
		//invertebrados
		if (anatomia.equalsIgnoreCase("invertebrado")){
			if (classe.equalsIgnoreCase("inseto")) {
				if (ordem.equalsIgnoreCase("hematofago")) {
					System.out.println("\nPulga");
				} else if (ordem.equalsIgnoreCase("herbivoro")) {
					System.out.println("\nLagarta");
				}
			}
			else if (classe.equalsIgnoreCase("anelideo")) {
				if (ordem.equalsIgnoreCase("hematofago")) {
					System.out.println("\nSanguessuga");
				} else if (ordem.equalsIgnoreCase("onivoro")) {
					System.out.println("\nMinhoca");
				}
			}
		}
		
		sc.close();

	}

}
