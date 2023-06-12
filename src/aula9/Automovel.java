package aula9;

public class Automovel extends Terrestre {
	private String cor;
	private int numeroPortas;
	private String placa;
	private int marcha;
	
	public Automovel() {
		super();
	}

	public Automovel(int capacidade, int numeroRodas, float velocidade, String cor, int numeroPortas, String placa, int marcha) {
		super(capacidade, numeroRodas, velocidade);
		this.cor = cor;
		this.numeroPortas = numeroPortas;
		this.placa = placa;
		this.marcha = marcha;
	}
	
	public Automovel(String cor, int numeroPortas, String placa, int marcha) {
		super();
		this.cor = cor;
		this.numeroPortas = numeroPortas;
		this.placa = placa;
		this.marcha = marcha;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroRodas() {
		return numeroPortas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroPortas = numeroRodas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	@Override
	public final void visualizar() {
		super.visualizar(); //referenciando o comportamento das classes TERRRESTRE e TRANSPORTE
		System.out.println("Cor: " + getCor());
		System.out.println("Número de portas: " + getNumeroRodas());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Marcha: " + getMarcha());
		
	}
	
}
