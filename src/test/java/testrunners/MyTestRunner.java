package testrunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "./src/test/resources/com/ecommerce/features",
				tags = "not @ignore" ,
            	glue = {"com.ecommerce.stepdefinition" , "AppHooks"},
            	plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
            			 },
            	monochrome = true,
                publish=true
            	
				)

public class MyTestRunner extends AbstractTestNGCucumberTests {
	
//
/*@Override
@DataProvider(parallel = true)
public Object[][] scenarios(){
return super.scenarios();*/
}

