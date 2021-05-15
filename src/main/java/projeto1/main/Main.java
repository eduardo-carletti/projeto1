package projeto1.main;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();
	}

	private void start() {
		// TODO Auto-generated method stub
		String text = "texto com letras minusculas";
		System.out.println(StringUtils.upperCase(text));
	}

}
