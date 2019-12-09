public class TesteDesempenho { 
	public static void main(String[] args){ 
		double normal = executaTeste(new InvocadorNormal()); 
		double reflection = executaTeste(new InvocadorReflexao()); 
		System.out.println( (reflection/normal) + " vezes mais que o normal" ); 
		double reflectionCache = executaTeste( new InvocadorReflexaoCache()); 
		System.out.println( (reflectionCache/normal) + " vezes mais que o normal" );
	} 
	public static double executaTeste(InvocadorMetodo invoc){
		long millis = System.nanoTime(); 
		invoc.invocarMetodo(100000); 
		String nomeClasse = invoc.getClass().getName(); 
		long diferenca = System.nanoTime() - millis; 
		System.out.println("A classe "+nomeClasse+ " demorou " + diferenca + " nano segundos"); 
		return diferenca; 
	}
}