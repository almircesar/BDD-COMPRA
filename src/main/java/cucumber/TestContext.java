package cucumber;

import managers.PageFactoryManager;
import managers.WebDriverManager;

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
