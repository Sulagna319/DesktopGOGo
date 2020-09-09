package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import util.WiniumDriverHelper;

import java.awt.*;
import java.io.IOException;

/**
 *
 * This test class works as Runner class .
 *
 * @author swghosh
 */


@CucumberOptions(features = "src/test/resource/Feature", glue = { "stepdef" }, tags ={"@login,@CheckOutValidationDiffUser"},
		plugin = { "pretty",
				"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.JSON" },monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {

	@BeforeSuite(alwaysRun = true)
	public void setupSuite() throws Throwable{
		WiniumDriverHelper.configdriver();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDownAfterSuite() throws InterruptedException, IOException ,FindFailed, AWTException {
		try {
			WiniumDriverHelper.teardown();
		}
		catch (FindFailed findFailed) {
			findFailed.printStackTrace();
		}
	}

}

//@IndexTableCreation,@SearchFormCreation
