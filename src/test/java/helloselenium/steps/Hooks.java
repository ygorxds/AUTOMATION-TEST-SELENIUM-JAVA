package helloselenium.steps;

import helloselenium.util.Navegacao;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("Iniciando a execu��o do Teste: " + scenario.getName());

	}

	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("Finalizando a execu��o do Teste: " + scenario.getName());
		Navegacao.quitDriver();
	}
}
