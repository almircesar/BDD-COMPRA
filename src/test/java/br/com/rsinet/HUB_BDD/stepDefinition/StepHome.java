package br.com.rsinet.HUB_BDD.stepDefinition;

import br.com.rsinet.HUB_BDD.cucumber.TestContext;
import br.com.rsinet.HUB_BDD.pageFactory.HomePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class StepHome {

	private TestContext testContext;
	private HomePage homePage;

	public StepHome(TestContext context) {

		testContext = context;
		homePage = testContext.getPageFactoryManager().getHomePage();

	}

	@Dado("^que estou no site advantage online shopping$")
	public void que_estou_no_site_advantage_online_shopping() throws InterruptedException {
		homePage.entraSite();
		homePage.waitElementcart();
		homePage.clicaBtnUser();

	}

	@Quando("^o usuario estiver logado$")
	public void o_usuario_estiver_logado() throws InterruptedException {

		homePage.waitElementbtnLogar();
		homePage.escreveUsername("almir");
		homePage.escreverSenha("Almir123");
		homePage.clicaLogar();
		homePage.waitElementcart();
		homePage.clicaSpeakers();
	}

}
