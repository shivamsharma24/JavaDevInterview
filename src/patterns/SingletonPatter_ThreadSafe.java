package patterns;

public class SingletonPatter_ThreadSafe {

	private static SingletonPatter_ThreadSafe instance;

	private SingletonPatter_ThreadSafe() {
	}

	// Thread- safe due to synchronized block in it
	public static SingletonPatter_ThreadSafe getInstance() {
		if (instance == null) {
			synchronized (SingletonPatter_ThreadSafe.class) {
				if (instance == null) {
					instance = new SingletonPatter_ThreadSafe();
				}
			}
		}
		return instance;
	}

	// Not Thread- safe
	public static SingletonPatter_ThreadSafe getInsance1() {
		if (instance == null) {
			instance = new SingletonPatter_ThreadSafe();
		}
		return instance;
	}
}
