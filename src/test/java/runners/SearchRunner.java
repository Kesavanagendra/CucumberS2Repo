package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\features\\Search.feature",
					glue = {"steps"},
					dryRun = false,
					plugin = {"pretty","html:target/Report2.html"}
					)
public class SearchRunner {

}
