package barretuino.curso.controle;

import barretuino.curso.modelagem.Produto;

/**
 * Exemplo de Instancia��o
 * @author Paulo Barreto
 * @date 05/10/2019
 */

public class PedidoCompra {
	public static void main(String[] args) {
		//Instancia��o de um novo Objeto do tipo Produto
		Produto produto = new Produto();
		
		//Utilizando m�todos Setter do Objeto Produto
		produto.setCodigo(1000);
		produto.setDescricao("Coca Cola");
		produto.setValor(3.89);
		produto.setSituacaoCadastral(true);
		
		//Utilizando m�todo Getter do Objeto Produto
		System.out.println("Codigo " + produto.getCodigo());
		System.out.println("Descri��o " + produto.getDescricao());
		System.out.println("Valor " + produto.getValor());
		
		//Implementa��o Tipica de um Desvio de Fluxo
		if(produto.isSituacaoCadastral()) {
			System.out.println("Situa��o Ativa");	
		}else {
			System.out.println("Situa��o Inativa");
		}
		
		//Otimizada para Desvio de Fluxo
		System.out.println("Situa��o " 
				+ (produto.isSituacaoCadastral() ? "Ativa" : "Inativa"));
	}		
}