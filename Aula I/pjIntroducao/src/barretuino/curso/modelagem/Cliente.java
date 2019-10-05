package barretuino.curso.modelagem;

public class Cliente {
	//Atributos
	private int rg;
	private String nome;
	private String sobrenome;
	
	//Construtor
	public Cliente() {
		//Faz nada
	}
	
	public Cliente(int rg, String nome, String sobrenome) {
		this.rg = rg;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Cliente(int rg) {
		this.rg = rg;
	}

	public int getRg() {
		return rg;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

}
