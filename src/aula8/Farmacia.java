package aula8;

public class Farmacia {
	private String nome;
	private Double preco;
	private String bula;
	private Integer classificacao;
	private Integer comprimidos;
	
	public Farmacia() {
		// TODO Auto-generated constructor stub
	}

	public Farmacia(String nome, Double preco, String bula, Integer classificacao, Integer comprimidos) {
		this.nome = nome;
		this.preco = preco;
		this.bula = bula;
		this.classificacao = classificacao;
		this.comprimidos = comprimidos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getBula() {
		return bula;
	}

	public void setBula(String bula) {
		this.bula = bula;
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}

	public Integer getComprimidos() {
		return comprimidos;
	}

	public void setComprimidos(Integer estoque) {
		this.comprimidos = estoque;
	}
	
	public void visualiza() {
		System.out.println("Dados: "
				+ "\nNome: " + getNome()
				+ "\nCartela com " + getComprimidos() + " comprimidos" + " = R$ " + String.format("%.2f", getPreco())
				+ "\nIndicado para: " + getBula()
				+ "\nAVISO: " + getNome() + " é contraindicado para menores de " + getClassificacao() + " anos");
	}
	
}
