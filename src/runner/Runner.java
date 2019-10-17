package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = 
{"D:\\Full_Stack_Training\\CucumberProject\\src\\feature\\Login.feature"})	// specifing path of the feature file
public class Runner extends AbstractTestNGCucumberTests 
{
	
}
