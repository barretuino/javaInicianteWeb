import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ConhecerEstrutura {

	Object objeto;
	
	public ConhecerEstrutura(Object obj){
		objeto = obj;
	}
	
	public void retornarEstrutura(){				
		//Tipo do Objeto recebido
		System.out.print(Modifier.toString(objeto.getClass().getModifiers()));
		System.out.println(" " + objeto.getClass());
		
		//Package da Classe
		System.out.println(objeto.getClass().getPackage()!= null ? objeto.getClass().getPackage() : "Default package");
		
		//Ancestral - extends
		System.out.println("Extends --> " + objeto.getClass().getSuperclass());
		
		//Implementa Interfaces
		System.out.println(objeto.getClass().getInterfaces().length > 0  
			? "Implementa --> " + objeto.getClass().getInterfaces() 
			: "Não implementa Interfaces");
		
		//Atributos
		System.out.println("Atributos"); 
		for(Field e: objeto.getClass().getDeclaredFields()){			
			System.out.print("\tQualificador de Acesso " + Modifier.toString(e.getModifiers()));
			System.out.print("\t" + e.getName() + " --> ");			
			System.out.println("\tTipo "  + e.getType());
		}	
		
		//Métodos
		System.out.println("Métodos"); 
		for(Method e: objeto.getClass().getDeclaredMethods()){			
			System.out.print("\t" + e.getName() + " --> ");
			System.out.print("\tRetorno "  + e.getReturnType() + " --> ");
			System.out.print("\tParâmetros " + "["); 
				for(Parameter p: e.getParameters()){
					System.out.print(p.getType());
				}; 
			System.out.println("]");			
		}
	}
	
	public static void main(String[] args) {
		ConhecerEstrutura ce;
		try {
			ce = new ConhecerEstrutura(Usuario.class.newInstance());
			ce.retornarEstrutura();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {			
			e.printStackTrace();
		}
	}
}