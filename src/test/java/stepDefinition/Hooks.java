package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import managers.WebDriverManager;


public class Hooks {

	WebDriver driver;
	TestContext testContext;
	WebDriverManager manager;

	public Hooks(TestContext context) {
		testContext = context;
		manager = testContext.getWebDriverManager();
		driver = manager.getDriver();
	}

	@Before
	public void BeforeSteps() {
		manager.getDriver();
		
	}

//	@After(order = 1)
//	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {
//		Wait.waitForPageLoad(driver);
//		Wait.untilJqueryIsDone(driver);
//		Wait.untilPageLoadComplete(driver);
//
//		String screenshotName = scenario.getName().replaceAll(" ", "_");
//		File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver())
//				.getScreenshotAs(OutputType.FILE);
//		File destinationPath = new File(
//				System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
//
//		Files.copy(sourcePath, destinationPath);
//
//		Reporter.addScreenCaptureFromPath(destinationPath.toString());
//	}
	
//	@After
//	public void AfterSteps() {
//		testContext.getWebDriverManager().closeDriver();
//	}
}