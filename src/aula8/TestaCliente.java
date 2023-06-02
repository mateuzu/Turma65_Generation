package aula8;

public class TestaCliente {

	public static void main(String[] args) {
		
		System.out.print("Cliente 1, ");
		Cliente cliente1 = new Cliente("Fulano de Tal", "faluno@gmail.com", "(11) 99999-9999"
				, "Rua dos bobos", 0);
		cliente1.visualiza();
		
		System.out.print("\nCliente 2, ");
		Cliente cliente2 = new Cliente("Ciclano de Tal", "ciclano@gmail.com", "(11) 12345-6789"
				, "Avenida Paulista", 433, 'A');
		cliente2.visualiza();
		
		
	}

}
