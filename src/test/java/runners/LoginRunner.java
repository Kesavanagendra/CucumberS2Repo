package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\test\java\features\Login.feature",
					glue = {"steps"},
					dryRun = false,
					plugin = {"pretty","html:target/Report1.html"}
					)
public class LoginRunner {

}
