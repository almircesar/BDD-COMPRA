package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.pt.Entao;
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

	@Quando("usuario escolhe item desejado$")
	public void usuario_escolhe_item_desejado() throws InterruptedException {

		produtopage.waitElementSpeakers();
		produtopage.clicaNoSpeakers();
		produtopage.waitElementColocarCarrinho();
		produtopage.clicaAddCarrinho();

	}

	@Quando("usuario vai a tela de pagamento$")
	public void usuario_vai_a_tela_de_pagamento() throws InterruptedException {
		produtopage.waitElementCheckout();
		produtopage.clicaCheckout();
		produtopage.waitElementNext();
		produtopage.clicaNext();
	}

	@Entao("usuario conclui a compra com sucesso$")
	public void usuario_conclui_a_compra_com_sucesso() throws InterruptedException {
		produtopage.clicaPay();
		Thread.sleep(1000);
		assertEquals(produtopage.textoEsperado.getText().contains("Thank you for buying with Advantage"), true);
	}

	@Quando("usuario escolhe produto$")
	public void usuario_escolhe_produto() throws InterruptedException {

		produtopage.waitElementSpeakers();
		produtopage.clicaNoSpeakers();
		produtopage.waitElementColocarCarrinho();
		produtopage.AdicinaOnzeItens();
		produtopage.clicaAddCarrinho();
	}
	@Entao("usuario vai a tela de pagamento com menos produtos que o requerido$")
	public void usuario_vai_a_tela_de_pagamento_com_menos_produtos_que_o_requerido() throws InterruptedException {
		produtopage.waitElementCheckout();
		produtopage.clicaCheckout();
		produtopage.waitElementNext();
		produtopage.clicaNext();
		assertEquals(produtopage.preco.getText().contains("$2,400.00"),false);
}
}