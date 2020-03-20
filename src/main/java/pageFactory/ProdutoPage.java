package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;

public class ProdutoPage {
	WebDriver driver;
	ProdutoPage produtopage;
	ConfigFileReader configFileReader;

	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	@FindBy(how = How.ID, using = "sign_in_btnundefined")
	private WebElement laptopHP;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article/div[1]/a/button")
	private WebElement hpPavilion;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement carrinhoAdd;

	public void waitElementLaptopHP() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(hpPavilion));
	}

	public void clicanotebook() {
		hpPavilion.click();

	}

	public void waitElementColocarCarrinho() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(carrinhoAdd));

	}

	public void clicaAddCarrinho() {
		carrinhoAdd.click();
	}
}