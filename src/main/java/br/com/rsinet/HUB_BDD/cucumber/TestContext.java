package br.com.rsinet.HUB_BDD.cucumber;

import br.com.rsinet.HUB_BDD.managers.PageFactoryManager;
import br.com.rsinet.HUB_BDD.managers.WebDriverManager;

public class TestContext {

	private WebDriverManager webDriverManager;
	private PageFactoryManager pageObjectManager;

	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageFactoryManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageFactoryManager getPageFactoryManager() {
		return pageObjectManager;
	}
}
