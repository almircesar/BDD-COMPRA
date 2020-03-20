package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pageFactory.HomePage;
import pageFactory.ProdutoPage;

public class StepHome {
	WebDriver driver;
	TestContext testContext;
	HomePage homePage;
	ProdutoPage produtopage;

	public StepHome(TestContext context) {

		testContext = context;
		homePage = testContext.getPageFactoryManager().getHomePage();
		produtopage = testContext.getPageFactoryManager().getProdutoPage();

	}

	@Dado("^que estou no site advantage online shopping$")
	public void que_estou_no_site_advantage_online_shopping() throws InterruptedException {
		homePage.entraAPP();
		homePage.waitElementLaptop();
		homePage.clicaBtnUser();
	

	}

	@Quando("^o usuario estiver logado$")
	public void o_usuario_estiver_logado() throws InterruptedException {
		homePage.escreveUsername("almir");
		homePage.escreverSenha("Almir123");
		homePage.clicaLogar();
		homePage.waitElementcart();
		homePage.clicaLaptopHome();
		
	}

}
