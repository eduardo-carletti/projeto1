package projeto1.main;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(final String[] args) {

		final Main app = new Main();
		app.start();
	}

	private void start() {

		final String text = "texto com letras minusculas";
		System.out.println(StringUtils.upperCase(text));
	}

}
