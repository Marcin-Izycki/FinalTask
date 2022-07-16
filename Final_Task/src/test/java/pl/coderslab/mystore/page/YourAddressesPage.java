package pl.coderslab.mystore.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YourAddressesPage {
    private WebDriver driver;

    public YourAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[data-link-action='add-address']")
    WebElement createAddressBtn;

    @FindBy(css = ".col-sm-6")
    private List<WebElement> addressesList;

    public void addNewAddressBtn (){
        createAddressBtn.click();
    }

//    public void checkAddress (String alias, String address, String city, String code, String phone) {
//        String actualAddress = driver.findElement(By.cssSelector(".address-body")).getText();
//        String expectedAddress = String.join("\n", alias, address, city, code, phone);
//        Assert.assertEquals(expectedAddress, actualAddress);
//    }

}
