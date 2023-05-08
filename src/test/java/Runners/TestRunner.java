package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json"
                , "junit:target/cucumber.xml", "me.jvt.cucumber.report.PrettyReports:target/"},
        features = "src/test/resources/LoginTest.feature",
        glue = {"StepDefinitions"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
