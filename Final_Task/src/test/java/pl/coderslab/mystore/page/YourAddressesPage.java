package pl.coderslab.mystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAddressesPage {
    private WebDriver driver;

    public YourAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[data-link-action='add-address']")
    WebElement createAddressBtn;

    public void addNewAddressBtn (){
        createAddressBtn.click();
    }

}
