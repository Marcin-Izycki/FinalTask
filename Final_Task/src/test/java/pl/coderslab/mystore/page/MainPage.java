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

    //@FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a/span")
    //private WebElement btn;

    public void signIn() {
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a/span")).click();
        //btn.click();
    }
}
