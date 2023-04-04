package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefiles",
					glue = "stepdefnition",
					tags = "@reg",
					monochrome =true,
					plugin= {"pretty","html:target/cucumber.html"})
public class TestRunner {

	
}
