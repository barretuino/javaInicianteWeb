package barretuino.curso.view;

import barretuino.curso.modelagem.Cliente;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente eu = new Cliente();
		
		Cliente voce = new Cliente(1);
		
		
		System.out.println(eu.getNome());
		
		System.out.println(voce.getNome());
	}
}
