package aula9;

public class Terrestre extends Transporte {
	private int numeroRodas;
	protected float velocidade;
	
	public Terrestre() {
		super();
	}

	public Terrestre(int capacidade, int numeroRodas, float velocidade) {
		super(capacidade); //referenciando o atributo da classe TRANSPORTE
		this.numeroRodas = numeroRodas;
		this.velocidade = velocidade;
	}
	
	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public void visualizar() {
		//super == transporte.visualizar
		super.visualizar(); //referenciando o comportamento da superclasse TRANSPORTE
		System.out.println("Números de rodas: " + getNumeroRodas());
		System.out.println("Velocidade: " + getVelocidade());
	}
}
