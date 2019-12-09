import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Acesso {
	public static void retornarFields(Object obj){
		Field[] atributos = obj.getClass().getDeclaredFields();
		
		for(Field e: atributos){			
			System.out.println(e.getName());
		}		
	}	
	
	public static void retornarMetodos(Object obj){
		Method[] metodos = obj.getClass().getMethods();
		
		for(Method e: metodos){
			System.out.println(e.getName());
		}
	}
	
	public static void invadirValores(Object obj){
		for (Field e: obj.getClass().getDeclaredFields()){
			e.setAccessible(true);
			try {
				if (e.getType() == String.class)
					e.set(obj, "Teste");
			} catch (IllegalArgumentException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
		}			
	}

	public static void main(String[] args){

		for(Method m : Acesso.class.getMethods()){
			if (m.getName().contains("retornar")){
				try {
					m.invoke(Acesso.class, Usuario.class.newInstance());
				} catch (IllegalAccessException e) {					
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				}
			}
		}
		
		Usuario usuario = null;
		try {
			usuario = Teste.class.newInstance().usuario.getClass().newInstance();
		} catch (InstantiationException e1) {	
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}		
		
		try {
			System.out.println(Teste.class.newInstance().usuario.getNome());
			System.out.println(Teste.class.newInstance().usuario.getSenha());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		Acesso.invadirValores(usuario);
		System.out.println(usuario.getNome());
		System.out.println(usuario.getSenha());
	}
}