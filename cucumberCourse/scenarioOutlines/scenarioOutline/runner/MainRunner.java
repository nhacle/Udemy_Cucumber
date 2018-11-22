package scenarioOutline.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = { ".\\scenarioOutlines\\scenarioOutline\\featureFile" }, glue = { "scenarioOutline.steps" })
public class MainRunner {

}
