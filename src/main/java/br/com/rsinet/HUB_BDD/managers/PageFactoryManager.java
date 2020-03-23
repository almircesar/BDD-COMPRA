package br.com.rsinet.HUB_BDD.managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageFactory.HomePage;
import br.com.rsinet.HUB_BDD.pageFactory.ProdutoPage;

public class PageFactoryManager {

	private WebDriver driver;
	private HomePage homePage;
	private ProdutoPage produtopage;

	public PageFactoryManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public ProdutoPage getProdutoPage() {

		return (produtopage == null) ? produtopage = new ProdutoPage(driver) : produtopage;

	}
}