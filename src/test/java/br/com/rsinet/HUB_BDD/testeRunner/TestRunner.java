package br.com.rsinet.HUB_BDD.testeRunner;

import java.io.File;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "br.com.rsinet.HUB_BDD.stepDefinition" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Compra.html" }, monochrome = true, dryRun = false)
public class TestRunner {

	public static void writeExtentReport() {
		Reporter.loadXMLConfig(
				new File("C:\\Users\\almir.damiao\\Desktop\\PROJETO-ALMIR\\Projeto\\Configs\\extent-config.xml"));

	}

}