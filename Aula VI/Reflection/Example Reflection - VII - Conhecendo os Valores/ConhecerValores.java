import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConhecerValores {
	Object objeto;
	
	public ConhecerValores(Object obj){
		this.objeto = obj;
	}
	
	public void retornarValores(){
		for(Field f: objeto.getClass().getFields()){
			try {
				System.out.println(objeto.getClass().getField(f.getName()));

				//Atributos
				System.out.println("Atributos");
				for (Field atributo : objeto.getClass().getField(f.getName()).getType().getDeclaredFields()){										
					System.out.println("\t" + atributo.getName());											
				}

				
				//Métodos
				System.out.println("Métodos");
				for (Method m : objeto.getClass().getField(f.getName()).getType().getMethods()){
					if (m.getName().contains("get")){						
						System.out.print("\t" + m.getName() + " = ");

						try {
							System.out.println(m.invoke(objeto.getClass().getField(f.getName()).get(objeto)));
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			ConhecerValores cv = new ConhecerValores(Teste.class.newInstance());
			cv.retornarValores();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}