package CP5;

public class Singleton {
	private static Singleton uniqueInstance = new Singleton();

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		return uniqueInstance;
	}

}
