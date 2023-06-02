package aula8;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		System.out.print("Remédio 1, ");
		Farmacia farmacia = new Farmacia("Dramin", 20.0, "Náuseas/vômitos", 12, 30);
		farmacia.visualiza();
		
		System.out.print("\nRemédio 2, ");
		Farmacia farmacia2 = new Farmacia("Advil", 9.99, "Analgésico para dor de cabeça/Enxaqueca", 12, 3);
		farmacia2.visualiza();
	}

}
