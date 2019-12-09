// Classe para ser utilizada como base 
public class Produto {
	private String nome; 
	private String categoria; 
	private Double preco; 
	private String descricao;
	
	public Produto(String nome, String categoria, Double preco, String descricao) { 
		this.nome = nome; 
		this.categoria = categoria; 
		this.preco = preco; 
		this.descricao = descricao; 
	}
	@Ignorar 
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	@NomePropriedade("classificacao") 
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}