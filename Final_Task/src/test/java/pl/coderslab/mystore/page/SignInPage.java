package pl.coderslab.mystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
    private WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(css = "input[name= email]")
    private WebElement emialInput;

    @FindBy(css = "[name=password]")
    private WebElement passwdInput;

    @FindBy(id = "submit-login")
    private WebElement loginBtn;

    public void logInAs(String email, String passwd) {
        emialInput.clear();
        emialInput.sendKeys(email);

        passwdInput.clear();
        passwdInput.sendKeys(passwd);

        loginBtn.click();
    }
}
