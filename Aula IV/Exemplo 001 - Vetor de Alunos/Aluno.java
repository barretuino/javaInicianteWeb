package estudo;

public class Aluno implements java.io.Serializable{
    public String nome;
    public int idade;
    
    public Aluno(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
    }
}