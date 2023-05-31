package aula5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> setNumeros = new HashSet<>();
		Integer num;
		
		System.out.println("Digite 10 números não repetidos: ");
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			setNumeros.add(num);
		}
		
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		System.out.println("\nListar dados do Set: ");
		while (isetNumeros.hasNext()) { //verifica se existe um proximo elemento
			System.out.print(isetNumeros.next() + " "); //imprime o proximo elemento
		}
		
		sc.close();
	}

}
