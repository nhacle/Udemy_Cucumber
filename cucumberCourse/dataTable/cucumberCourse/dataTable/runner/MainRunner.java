package cucumberCourse.dataTable.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\Documents\\SelfLearning\\ResearchAutomation\\udemy\\Udemy_Cucumber\\cucumberCourse\\dataTable\\cucumberCourse\\dataTable\\featureFiles", glue = "cucumberCourse.dataTable.steps"

)
public class MainRunner {

}
