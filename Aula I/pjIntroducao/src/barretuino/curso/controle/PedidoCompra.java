package barretuino.curso.controle;

import barretuino.curso.modelagem.Produto;

/**
 * Exemplo de Instanciação
 * @author Paulo Barreto
 * @date 05/10/2019
 */

public class PedidoCompra {
	public static void main(String[] args) {
		//Instanciação de um novo Objeto do tipo Produto
		Produto produto = new Produto();
		
		//Utilizando métodos Setter do Objeto Produto
		produto.setCodigo(1000);
		produto.setDescricao("Coca Cola");
		produto.setValor(3.89);
		produto.setSituacaoCadastral(true);
		
		//Utilizando método Getter do Objeto Produto
		System.out.println("Codigo " + produto.getCodigo());
		System.out.println("Descrição " + produto.getDescricao());
		System.out.println("Valor " + produto.getValor());
		
		//Implementação Tipica de um Desvio de Fluxo
		if(produto.isSituacaoCadastral()) {
			System.out.println("Situação Ativa");	
		}else {
			System.out.println("Situação Inativa");
		}
		
		//Otimizada para Desvio de Fluxo
		System.out.println("Situação " 
				+ (produto.isSituacaoCadastral() ? "Ativa" : "Inativa"));
	}		
}