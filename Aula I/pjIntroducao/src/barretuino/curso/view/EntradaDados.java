package barretuino.curso.view;

import java.util.Scanner;

import barretuino.curso.modelagem.Produto;

public class EntradaDados {
	public static void main(String[] args) {
		//Vetor de Produtos
		Produto vetProduto[] = new Produto[3];
		Scanner digito = new Scanner(System.in);
		
		//Escrita do meu Vetor de Produtos
		for(int i=0; i<3; i++) {
			Produto temp = new Produto();
			
			System.out.println("Informe o codigo ");
			temp.setCodigo(digito.nextInt());
			
			System.out.println("Descrição ");
			temp.setDescricao(digito.next());
			
			System.out.println("Informe valor ");
			temp.setValor(digito.nextDouble());
			
			System.out.println("Situação Cadastral (T | F)");
			temp.setSituacaoCadastral(digito.next().toUpperCase().equals("T"));
					
			vetProduto[i] = temp;
		}	
		
		//Saida do vetor
		for(int i=0; i<3; i++) {
			System.out.println(vetProduto[i].toString());
		}
		
		digito.close();
	}	
}
