package helloselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPGE {

	WebDriver driver;
	private String campoSenhaXpath = "//input[@id='txtPassword']";

	public LoginPGE(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getCampoSenha() {
		return driver.findElement(By.xpath(campoSenhaXpath));
	}
}
