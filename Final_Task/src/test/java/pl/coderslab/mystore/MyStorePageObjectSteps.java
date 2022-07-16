package pl.coderslab.mystore;

import io.cucumber.core.cli.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.mystore.page.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
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

    //#######################################################
//    @Then("I check the added address {}, {}, {}, {} and {}")
//    public void iCheckTheAddedAddress(String alias, String address, String city, String code, String phone) {
//        YourAddressesPage yourAddressesPage = new YourAddressesPage(driver);
//    }
//#######################################################

    @And("I close page")
    public void iClosePage() {
        driver.quit();
    }

    //Task two steps
    @And("I go on main page")
    public void iGoOnMainPage() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.goMainPage();
    }

    @And("I select Hummingbird Printed Sweater")
    public void iSelectHummingbirdPrintedSweater() {
        MainPage mainPage = new MainPage(driver);
        mainPage.selectProduct();
    }

    @And("I select size and quantity")
    public void iSelectSizeAndQuantity() {
        ProductPage productPage = new ProductPage(driver);
        productPage.selectAtribute();
    }

    @And("I add product to Cart")
    public void iAddProductToCartAndProceedToCheckout() {
        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart();
    }

    @And("I proceed to checkout")
    public void iProceedToCheckout() {
        CartPage cartPage = new CartPage(driver);
        cartPage.proceedShopping();
    }

    @And("I confirm the address")
    public void iConfirmTheAddress() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.confirmAddress();
    }

    @And("I select shipping method")
    public void iSelectShippingMethod() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.confirmShippingMethod();
    }

    @And("I select payment")
    public void iSelectPayment() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.confirmPayment();
    }

    @And("I process the order")
    public void iProcessTheOrder() {
        OrderPage orderPage = new OrderPage(driver);
        orderPage.finishOrder();
    }

    @And("I make screenshot")
    public void iMakeScreenshot() throws IOException {
        OrderConfirmingPage orderConfirmingPage = new OrderConfirmingPage(driver);
        orderConfirmingPage.screenShoot();
    }

    @Then("I check the added address alias (.*), address (.*), city (.*), postal code (.*), country and phone (.*)")
    public void iCheckTheAddedAddressAliasAliasAddressAddressCityCityPostalCodeCodeCountryAndPhonePhone(String alias, String address, String city, String code, String phone) {
        String actualAddress = driver.findElement(By.cssSelector(".address-body")).getText();
        String expectedAddress = String.join("\n", alias, "Dan Dan", address, city, code, phone);
        Assert.assertEquals(expectedAddress, actualAddress);
        //throw new io.cucumber.java.PendingException();
    }
}