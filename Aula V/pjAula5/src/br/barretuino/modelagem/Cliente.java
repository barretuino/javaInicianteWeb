package br.barretuino.modelagem;

/**
 * Modelagem Conceitual de Cliente
 * @author Paulo Barreto
 * @data 23/11/2019
 */

public class Cliente {
	//Atributos
	private double cpf;
	private String nome;
	private String endRua;
	private int endNum;
	private String endBairro;
	private String endCidade;
	private String endUF;
	private String endComplemento;
	private String sexo;
	
	//Métodos
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndRua() {
		return endRua;
	}
	public void setEndRua(String endRua) {
		this.endRua = endRua;
	}
	public int getEndNum() {
		return endNum;
	}
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
	public String getEndBairro() {
		return endBairro;
	}
	public void setEndBairro(String endBairro) {
		this.endBairro = endBairro;
	}
	public String getEndUF() {
		return endUF;
	}
	public void setEndUF(String endUF) {
		this.endUF = endUF;
	}
	public String getEndComplemento() {
		return endComplemento;
	}
	public void setEndComplemento(String endComplemento) {
		this.endComplemento = endComplemento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndCidade() {
		return endCidade;
	}
	public void setEndCidade(String endCidade) {
		this.endCidade = endCidade;
	}
}
