package cucumberCourse.dataTable.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\dataTable\\cucumberCourse\\dataTable\\featureFiles", glue = "cucumberCourse.dataTable.steps"

)
public class MainRunner {

}
