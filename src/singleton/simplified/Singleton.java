package singleton.simplified;

public class Singleton {
	public static Singleton singleton = null;
	private String message = "";

	private Singleton() {
	}

	public static Singleton newInstance(String message) {
		if (singleton == null) {
			singleton = new Singleton();
			singleton.setMessage(message);
		}
		return singleton;
	}

	private void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	/**
	 * el codigo main no forma parte del patron, solo se utiliza para aplicar el
	 * patron
	 */
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.newInstance("singleton1");
		System.out.println(singleton1.getMessage());

		Singleton singleton2 = Singleton.newInstance("singleton2");
		System.out.println(singleton2.getMessage());
	}

}
