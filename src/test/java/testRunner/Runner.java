package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags ="@smoke", features = {"src/test/resources/AddToCart.feature","src/test/resources/Login.feature"},
        glue = {"DarazStepDefs"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/login.html"
        })
@Test
public class Runner  extends AbstractTestNGCucumberTests {
}
