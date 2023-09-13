package TestRunner;

import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitons", "util"},
        tags = "",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html"
        }
)

public class runners extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();
}
