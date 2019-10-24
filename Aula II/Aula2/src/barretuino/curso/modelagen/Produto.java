package barretuino.curso.modelagen;

/**
 * Modelagem Conceitual de um Produto
 * @author Prof. Paulo Barreto
 * @date 19/10/2019
 */

public class Produto {
	//Atributos
	private int id;
	private String descricao;
	private float quantidade;
	private float valor;
	private TipoProduto tipoProduto;
	
	//Métodos Construtores
	public Produto() {
		//TODO: Não faz nada
	}
	
	public Produto(int id, String descricao, float quantidade,
					float valor, TipoProduto tipoProduto) {
		this.id = id;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
		this.tipoProduto = tipoProduto;
	}
	
	//Métodos Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	
	
	
}
