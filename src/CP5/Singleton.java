package CP5;

public class Singleton {

	// the volatile keyword ensures that multiple threads handle the
	// unique instance
	private volatile static Singleton uniqueInstance;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}

}
