package helloselenium.pageobjects;

public class Example2 implements IBasePage {

	public static void main(String[] args) {
		LoginPage loginFirefox = new LoginPage(FIREFOX);
		loginFirefox.toLogin();
		loginFirefox.realizaLogin("Admin", "admin123");
		
	}

}
