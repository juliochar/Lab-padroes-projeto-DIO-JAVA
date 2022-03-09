package one.dio.exemplo.gof.singleton;

public class TesteSingleton {

	public static void main(String[] args) {
		SingletonLazy lazySingle = SingletonLazy.getInstancia();
		
		System.out.println(lazySingle);
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		
		SingletonLazyHolder singletonholder = SingletonLazyHolder.getInstancia();
		System.out.println(singletonholder);
		singletonholder = SingletonLazyHolder.getInstancia();
		System.out.println(singletonholder);
			
		

	}

}
