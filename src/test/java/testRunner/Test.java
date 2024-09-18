package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/Login.feature",
		glue= "stepDefination",
		monochrome = true,
		dryRun = true
//		plugin = {"preety","html:target/CucumberReport/report.html",
//		         "preety","json:target/CucumberReport/report.json",
//		         "preety","junit:target/CucumberReport/report.xml"}
		
		)

public class Test {
	
	

}
