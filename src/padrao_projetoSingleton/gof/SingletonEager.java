package padrao_projetoSingleton.gof;

/*
 * padrao de projeto Singleton Eager
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {		
		return instancia;
	}

}
