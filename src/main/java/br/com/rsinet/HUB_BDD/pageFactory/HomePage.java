package br.com.rsinet.HUB_BDD.pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	// login almir senha almir123

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement btnUser;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")
	private WebElement usernameLogin;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")
	private WebElement passwordLogin;

	@FindBy(how = How.ID, using = "speakersImg")
	private WebElement speakers;

	@FindBy(how = How.XPATH, using = "//*[@id=\"sign_in_btnundefined\"]")
	private WebElement btnLogar;

	@FindBy(how = How.ID, using = "menuCart")
	private WebElement btncarrinho;

	public void entraSite() {
		driver.get(br.com.rsinet.HUB_BDD.managers.FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	public void clicaBtnUser() {
		btnUser.click();

	}

	public void escreveUsername(String username) {

		usernameLogin.sendKeys(username);
	}

	public void escreverSenha(String senha) {

		passwordLogin.sendKeys(senha);
	}

	public void clicaSpeakers() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", speakers);

	}

	public void clicaLogar() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnLogar);
	}

	public void waitElementspeakers() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(speakers));
	}

	public void waitElementcart() {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(btncarrinho));
	}

	public void waitElementbtnLogar() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(btnLogar));
	}

}