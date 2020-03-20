package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.pt.Quando;
import pageFactory.ProdutoPage;

public class StepProduto {
	WebDriver driver;
	TestContext testContext;
	ProdutoPage produtopage;

	public StepProduto(TestContext context) {

		testContext = context;
		produtopage = testContext.getPageFactoryManager().getProdutoPage();

	}
	
//	@Quando("usuario escolhe item desejado$")
//	public void usuario_escolhe_item_desejado() throws InterruptedException {
//		
//		produtopage.waitElementLaptopHP();
//		produtopage.clicanotebook();
//		produtopage.waitElementColocarCarrinho();
//		produtopage.clicaAddCarrinho();
//		Thread.sleep(2000);
//		
//	}

}
