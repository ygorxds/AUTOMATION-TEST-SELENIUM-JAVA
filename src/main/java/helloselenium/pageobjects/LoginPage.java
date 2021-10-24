package helloselenium.pageobjects;

import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	private String campoUsername = "//input[@id='txtUsername']";
	private String campoPassword = "#txtPassword";
	private String botaoLogin = "btnLogin";

	public WebElement getCampoUsername() {
		return getElementByXpath(campoUsername);
	}

	public WebElement getCampoPassword() {
		return getElementByCssSelector(campoPassword);
	}

	public WebElement getBotaoLogin() {
		return getElementById(botaoLogin);

	}

	public void realizaLogin(String usuario, String senha) {
		getCampoUsername().sendKeys(usuario);
		getCampoPassword().sendKeys(senha);
		getBotaoLogin().click();
	}
	
	public void toLogin() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php");
	}
}
