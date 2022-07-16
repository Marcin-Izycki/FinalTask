package pl.coderslab.mystore.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "user-info")
    private WebElement btn;

    public void signIn() {
        btn.click();
        //driver.findElement(By.className("user-info")).click();
    }

    @FindBy(xpath = "//*[@id=\"content\"]/section/div/article[2]/div/div[1]/h3/a")
    private WebElement productName;

    public void selectProduct() {
        productName.click();
    }
}
