import java.lang.reflect.Method;

public class InvocadorReflexaoCache implements InvocadorMetodo { 
	public void invocarMetodo(int vezes) { 
		try { 
			ClasseTeste ct = new ClasseTeste();
			Method m = ct.getClass().getMethod("metodoVazio"); 
			for(int i=0; i<vezes; i++){ 
				m.invoke(ct); 
			}
		} catch (Exception e) { 
			throw new RuntimeException("Não consegui invocar o método",e); 
		}
	}
}