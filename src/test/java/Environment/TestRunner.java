package Environment;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue={"StepDefinitions", "Environment"},
        tags = "@automated",
        plugin = {"pretty", "html:result/html_report.html", "json:result/result.json", "junit:result/junit.xml", "rerun:result/failed_tests.txt"}
)
public class TestRunner {
}