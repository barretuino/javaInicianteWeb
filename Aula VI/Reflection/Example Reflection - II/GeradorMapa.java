import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class GeradorMapa { 
	public static Map<String, Object> gerarMapa(Object o){ 
		Class<?> classe = o.getClass(); 
		Map<String, Object> mapa = new HashMap<>(); 
		for(Method m: classe.getMethods()){ 
			try { 
				if(isGetter(m)){ 
					String propriedade = deGetterParaPropriedade( m.getName()); 
					Object valor = m.invoke(o); 
					mapa.put(propriedade, valor); 
				} 
			} catch (Exception e) { 
				throw new RuntimeException( "Problema ao gerar o mapa",e); 
			} 
		} return mapa;
	} 
	private static boolean isGetter(Method m) { 
		return m.getName().startsWith("get") && m.getReturnType() != void.class && m.getParameterTypes().length == 0; 
	} 
	private static String deGetterParaPropriedade(String nomeGetter){ 
		StringBuffer retorno = new StringBuffer(); 
		retorno.append(nomeGetter.substring(3, 4).toLowerCase()); 
		retorno.append(nomeGetter.substring(4)); return retorno.toString(); 
	}

	//Código que executa o método de geração do mapa e imprime 
	public static void main(String[] args){
		Produto p = new Produto("Design Patterns","LIVRO",59.90, "Publicado pela Casa do Codigo"); 
		Map<String,Object> props = GeradorMapa.gerarMapa(p); 
		for(String prop : props.keySet()){ 
			System.out.println(prop+" = "+props.get(prop)); 
		}
	}
}