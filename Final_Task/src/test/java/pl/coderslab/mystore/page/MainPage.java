package pl.coderslab.mystore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "a[title='Log in to your customer account']")
    private WebElement signInBtn;

    public void signIn() {
        signInBtn.click();
    }
}
