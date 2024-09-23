package patterns;

public class EagerSingleTonDesignPattern {

	// create an instance of class at the time of class loading
	private static final EagerSingleTonDesignPattern instance = new EagerSingleTonDesignPattern();

	private EagerSingleTonDesignPattern() {

	}

	public static EagerSingleTonDesignPattern getInstance() {
		return instance;
	}
}
