package patterns;

public class LazySingleTonDesignPattern {
	// Use volatile to ensure the visibility of changes to multiple threads.
	private static volatile LazySingleTonDesignPattern instance;;

	private LazySingleTonDesignPattern() {

	}

	// creates an instance only when needed and ensures thread safety.
	public static LazySingleTonDesignPattern getInstance() {
		if (instance == null) {
			synchronized (LazySingleTonDesignPattern.class) {
				if (instance == null) {
					instance = new LazySingleTonDesignPattern();
				}
			}
		}
		return instance;
	}
}
