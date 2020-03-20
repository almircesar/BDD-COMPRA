package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;

public class HomePage {
	//login almir senha almir123
	
	 WebDriver driver;
	 HomePage homepage;
	 ConfigFileReader configFileReader;
		
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}
	
	@FindBy(how = How.ID,using="menuUser")
	private WebElement btnUser;
	
	@FindBy(how = How.XPATH, using="/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")
	private WebElement usernameLogin;
	
	@FindBy(how = How.XPATH, using="/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")
	private WebElement passwordLogin;
	
	@FindBy(how = How.CLASS_NAME,using="laptopsImg")
	private WebElement laptopHome;
	
	@FindBy(how = How.ID,using="sign_in_btnundefined")
	private WebElement btnLogar ;
	
	@FindBy(how = How.ID,using="menuCart")
	private WebElement btncarrinho ;
	
	public void entraAPP() {
		driver.get(managers.FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
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
	public void clicaLaptopHome() {
		laptopHome.click();
		
		
	}
	public void clicaLogar() {
		btnLogar.click();	
	}
	
	public void waitElementLaptop() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(laptopHome));
	}
	public void waitElementcart() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(btncarrinho));
	}

}