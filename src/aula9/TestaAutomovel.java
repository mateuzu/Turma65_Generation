package aula9;

public class TestaAutomovel {

	public static void main(String[] args) {
		
		Automovel carro = new Automovel(5, 4, 80f, "Vermelho", 4, "GEN-6523", 3);
		Terrestre carro2 = new Automovel("Vermelho", 4, "GEN-6523", 3); //upcasting
		/*
		 * UPCASTING: O upcasting ocorre quando você atribui uma instância de uma subclasse a uma variável
		 * de referência da superclasse - EX: Automovel sendo atribuída à Terrestre
		 * 
		 *DOWNCASTING: O downcasting ocorre quando você atribui uma instância de uma superclasse a uma variável
		 *de referência de uma subclasse - EX: Transporte sendo atribuida à Automovel
		 */
		//Automovel skate = (Automovel) new Transporte(); //downcasting
		Terrestre moto = new Terrestre(5, 4, 75f);
		//Terrestre bike = new Automovel(0, 0, 0, null, 0, null, 0);
		
		carro.visualizar();
		carro2.visualizar();
		moto.visualizar();
	}

}
