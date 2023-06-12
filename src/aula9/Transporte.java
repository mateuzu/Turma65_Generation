package aula9;

public class Transporte {
	private int capacidade;
	
	public Transporte() {
		// TODO Auto-generated constructor stub
	}

	public Transporte(int capacidade) {
		super();
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void visualizar() {
		System.out.println("\n\n************************************************************");
		System.out.println("Dados do Meio de Transporte:");
		System.out.println("****************************************************************");
		System.out.println("Capacidade (número de passageiros: " + getCapacidade());
	}
}
