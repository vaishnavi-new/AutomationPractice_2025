package Runner;

import Steps.ProjectSpecification;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "Steps",
        monochrome = true,
        plugin = {"pretty"}
)
public class TestRunner extends AbstractTestNGCucumberTests {





}