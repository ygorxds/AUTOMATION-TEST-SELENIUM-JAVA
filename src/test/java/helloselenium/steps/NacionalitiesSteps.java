package helloselenium.steps;

import helloselenium.pageobjects.NacionalitiePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class NacionalitiesSteps {
	NacionalitiePage nacionalitiePage = new NacionalitiePage();

	@Dado("que o usuario esteja na pagina Nacionalities")
	public void queOUsuarioEstejaNaPaginaNacionalities() {
		nacionalitiePage.acessaOpcaoMenuNacionalities();
	}

	@Dado("a nacionalitie {string} nao exista")
	public void aNacionalitieNaoExista(String string) {
		nacionalitiePage.validaNacionalidadeNaoExistenteNaLista(string);
	}

	@Quando("adicionar a nacionalitie {string}")
	public void adicionarANacionalitie(String nacionalidade) {
		nacionalitiePage.cadastraNacionalitie(nacionalidade);
	}

	@Entao("a nacionalidade sera exibida na lista")
	public void aNacionalidadeSeraExibidaNaLista() {
		nacionalitiePage.verificaNacionalidadeCadastrada();
	}


}
