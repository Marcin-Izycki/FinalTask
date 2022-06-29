package pl.coderslab.mystore;

import io.cucumber.core.cli.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.mystore.page.*;

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
        logIn.logInAs(email, passwd);
    }

    @And("I select address")
    public void iSelectAddress() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.createNewAddress();
    }

    @And("I create new address")
    public void iCreateNewAddress() {
        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
        yourAddressesPage.addNewAddressBtn();
    }

    @And("^I enter alias (.+), address (.+), city (.+), postal code (.+), country and phone (.+)$")
    public void enterDataAddress(String alias, String address, String city, String code, String phone) {
        CreateNewAddressPage createNewAddressPage = new CreateNewAddressPage(driver);
        createNewAddressPage.enterAddress(alias, address, city, code, phone);
    }

    @Then("I check the added address")
    public void iCheckTheAddedAddress() {
        //musze pobać elementy do tabeli i sprawdzić ostatni czy jest taki sam
        //znajduje sięna stronie YourAddressesPage
        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);

    }

    @And("I close page")
    public void iClosePage() {
        driver.quit();
    }
}