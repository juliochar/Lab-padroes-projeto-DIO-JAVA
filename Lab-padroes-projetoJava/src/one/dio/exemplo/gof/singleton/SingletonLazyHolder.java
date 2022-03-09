package one.dio.exemplo.gof.singleton;


//Singleton mais otimizado - LazyHolder
public class SingletonLazyHolder {
	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
			
	private SingletonLazyHolder() {
		super();
	
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}
