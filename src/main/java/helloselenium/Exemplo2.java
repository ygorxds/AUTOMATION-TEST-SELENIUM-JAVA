package helloselenium;

import helloselenium.pageobjects.LoginPage;

public class Exemplo2 {

	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		login.toLogin();
		login.realizaLogin("Admin", "admin123");
	}

}
