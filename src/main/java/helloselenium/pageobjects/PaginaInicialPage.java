package helloselenium.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class PaginaInicialPage extends BasePage {

	private String painelQuickLaunch = "//*[@id='dashboard-quick-launch-panel-menu_holder']/table/tbody/tr/td[3]/div";
	private String opcaoMenuAdmin = "//*[@id='menu_admin_viewAdminModule']/b";

	Actions action = new Actions(this.driver);

	public void estouNaPaginaInicial() {
		Assert.assertTrue(getElementByXpath(painelQuickLaunch).isDisplayed());
	}

	public void acessaMenuAdmin() {
		action.click(getElementByXpath(opcaoMenuAdmin)).perform();
	}
}
