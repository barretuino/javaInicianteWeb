package barretuino.curso.modelagem;

import java.util.Date;

/**
 * Classe de Modelagem Conceitual
 * @author Paulo Barreto
 * @date 26/10/2019
 */
public class Livro {
	//Atributos
	private String titulo;
	private String autor;
	private String isbn;
	private float valor;
	private Date data;
	
	//Construtor
	public Livro() {
		
	}

	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}	
	
	@Override
	public String toString() {
		String retorno = "Titulo " + getTitulo() +
						 " Autor " + getAutor() + 
						 " ISBN " + getIsbn() + 
						 " Valor R$ " + getValor() + 
						 " Data de Compra " + getData();
		
		return retorno;
	}
}