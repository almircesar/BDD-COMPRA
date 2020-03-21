package pageFactory;

import org.openqa.selenium.JavascriptExecutor;
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
	private JavascriptExecutor js;
	

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

	@FindBy(how = How.ID, using = "checkOutPopUp")
	private WebElement checkout;

	@FindBy(how = How.ID, using = "next_btn")
	private WebElement btnNext;

	@FindBy(how = How.ID, using = "pay_now_btn_MasterCredit")
	private WebElement btnPay;

	@FindBy(how = How.XPATH, using = "//*[@id=\"orderPaymentSuccess\"]/div/div[1]/div/div[3]/label")
	private WebElement cell;
	
	public void waitElementNext() {
		WebDriverWait wait = new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.visibilityOf(btnNext));
	}
	public void clicaPay() {
		btnPay.click();
		
	}

	public void clicaNext() {
		btnNext.click();
	}

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

	public void clicaCheckout() {
		checkout.click();

	}

	public void waitElementCheckout() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(carrinhoAdd));
	}
//	public void rolarTela() {
//		js.executeScript ("window.scrollBy(0, 1000)");
//
//		
//	}
	
	
}