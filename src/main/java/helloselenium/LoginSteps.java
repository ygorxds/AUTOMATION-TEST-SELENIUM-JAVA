package helloselenium;

import java.util.Map;

import helloselenium.pageobjects.IBasePage;
import helloselenium.pageobjects.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
public class LoginSteps implements IBasePage {
	
	LoginPage loginPage = new LoginPage(FIREFOX);
	
	@Dado("^que o usuario esteja na pagina de login$")
	public void queOUsuarioEstejaNaPaginaDeLogin() {
		loginPage.toLogin();
	}
	
	@Quando("^o usuario inserir as credenciais na pagina$")
	public void oUsuarioInserirAsCredenciaisNaPagina(DataTable data) {
		for(Map<Object, Object> map : data.asMaps(String.class,String.class)) {
			loginPage.realizaLogin(map.get("usuario").toString(), map.get("senha").toString());
		}
	}
}
