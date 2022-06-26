package pl.coderslab;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Features", plugin = {"pretty", "html:out.html"}, tags = "@edit")
public class AddAddressTest {
}
