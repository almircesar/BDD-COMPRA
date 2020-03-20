package managers;

import org.openqa.selenium.WebDriver;

import pageFactory.HomePage;
import pageFactory.ProdutoPage;

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