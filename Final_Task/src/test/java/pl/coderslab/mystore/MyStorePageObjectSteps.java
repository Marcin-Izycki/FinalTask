package pl.coderslab.mystore;

import io.cucumber.core.cli.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.mystore.page.MainPage;
import pl.coderslab.mystore.page.SignInPage;

import java.time.Duration;

public class MyStorePageObjectSteps {
    private WebDriver driver;


    @Given("I'm on main page")
    public void openMyStoreMainPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }
    @When("I got to login page")
    public void IGoToSignInPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.signIn();
    }

    @And("I log in using {string} and {string}")
    public void LogIn(String email, String passwd) {
        SignInPage logIn = new SignInPage(driver);
    }
}
