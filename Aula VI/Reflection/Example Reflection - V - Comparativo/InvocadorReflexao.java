import java.lang.reflect.Method;

public class InvocadorReflexao implements InvocadorMetodo { 
	public void invocarMetodo(int vezes) { 
		try { ClasseTeste ct = new ClasseTeste(); 
		for(int i=0; i<vezes; i++){ 
			Method m = ct.getClass().getMethod("metodoVazio"); m.invoke(ct); 
		} 
		} catch (Exception e) { 
			throw new RuntimeException("Não consegui invocar o método",e); 
		} 
	} 
} 