package singleton;

public class Singleton {
	
	private static volatile Singleton instance = null;
	
	public Singleton() {
		if(instance != null) {
			throw new RuntimeException("please use getInstance() method !");
		}
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
