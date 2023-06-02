package aula8;

public class Game {
	private String nome;
	private Integer codigo;
	private Double preco;
	private Integer quant;
	private Float avaliacao;
	
	public Game() {
		
	}

	public Game(String nome, Double preco, Integer quant, Integer codigo, Float avaliacao) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
		this.codigo = codigo;
		this.avaliacao = avaliacao;
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

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Float avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public void visualiza() {
		System.out.println("Dados: "
				+ "\nCódigo: " + getCodigo()
				+ "\nNome: " + getNome()
				+ "\nPreço unitário: R$ " + String.format("%.2f", getPreco())
				+ "\nQuantidade no carrinho: " + getQuant()
				+ "\nAvaliação média: " + getAvaliacao() + " estrelas");
	}
	
}
