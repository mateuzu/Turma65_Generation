package aula8;

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private Integer numeroCasa;
	private Character complemento;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String email, String telefone, String endereco, Integer numeroCasa) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.numeroCasa = numeroCasa;
	}
	
	public Cliente(String nome, String email, String telefone, String endereco, Integer numeroCasa,
			Character complemento) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.numeroCasa = numeroCasa;
		this.complemento = complemento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(Integer numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public Character getComplemento() {
		return complemento;
	}

	public void setComplemento(Character complemento) {
		this.complemento = complemento;
	}
	
	public void visualiza() {
		if (getComplemento() != null) {
			System.out.println("Informações de cadastro: "
					+ "\nNome: " + getNome()
					+ "\nE-mail: " + getEmail()
					+ "\nTelefone: " + getTelefone()
					+ "\nEndereço: " + getEndereco() + ", número: " + getNumeroCasa() + 
					", complemento: " + getComplemento());
		} else {
			System.out.println("Informações de cadastro: "
					+ "\nNome: " + getNome()
					+ "\nE-mail: " + getEmail()
					+ "\nTelefone: " + getTelefone()
					+ "\nEndereço: " + getEndereco() + ", número: " + getNumeroCasa());
		}
	
	}
	
}
