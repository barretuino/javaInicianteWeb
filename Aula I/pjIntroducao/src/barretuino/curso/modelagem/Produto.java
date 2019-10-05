package barretuino.curso.modelagem;

/**
 * Modelagem Conceitual da Classe Produto
 * @ExemploUso Produto produto
 * @author Paulo Barreto
 * @date 05/10/2019
 */

public class Produto {
	//Atributos
	private int codigo;
	private String descricao;
	private double valor;
	private boolean situacaoCadastral;

	//Métodos
	/**
	 * Método que recebe o código
	 * @return void
	 */
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isSituacaoCadastral() {
		return situacaoCadastral;
	}
	public void setSituacaoCadastral(boolean situacaoCadastral) {
		this.situacaoCadastral = situacaoCadastral;
	}	

	@Override
	public String toString() {
		String jsonProduto = "{codigo: " + this.getCodigo() +
				", descricao: \"" + this.getDescricao() + "\"" +
				", valor: " + this.getValor() + 
				", situacaoCadastral: " + this.isSituacaoCadastral() + "}";
		return jsonProduto;
	}
}