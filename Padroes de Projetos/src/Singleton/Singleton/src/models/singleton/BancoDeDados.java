package models.singleton;

public class BancoDeDados {
	private static BancoDeDados instance;

	private BancoDeDados() {
	}

	public static BancoDeDados getInstance() {
		if (instance == null) {
			instance = new BancoDeDados();
		}
		return instance;
	}

}