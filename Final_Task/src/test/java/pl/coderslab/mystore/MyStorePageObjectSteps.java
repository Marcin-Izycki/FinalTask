package pl.coderslab.mystore;

import io.cucumber.core.cli.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.mystore.page.MainPage;

import java.time.Duration;

public class MyStorePageObjectSteps {
    private WebDriver driver;


    @Given("I'm on main page")
    public void openHotelMainPage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }
    @When("I got to login page")
    public void SignInPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.signIn();
    }
}
