package testeRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./Feature", glue = "stepDefinition")
//, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)

public class TestRunner {
	
//	@AfterClass
//	public static void writeExtentReport() {
//		com.cucumber.listener.Reporter
//				.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//
//	}
}