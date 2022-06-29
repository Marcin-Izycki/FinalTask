package pl.coderslab.mystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAddressPage {
    private WebDriver driver;

    public CreateNewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='alias']")
    private WebElement aliasInput;

    @FindBy(css = "input[name='address1']")
    private WebElement addressInput;

    @FindBy(css = "input[name='city']")
    private WebElement cityInput;

    @FindBy(css = "input[name='postcode']")
    private WebElement codeInput;

    @FindBy(css = "select[name='id_country']")
    private WebElement countryList;

    @FindBy(css = "option[value='17']")
    private WebElement countryUK;

    @FindBy(css = "input[name='phone']")
    private WebElement phoneInput;

    @FindBy(className = "btn-primary")
    private WebElement submitBtn;


    public void enterAddress(String alias, String address, String city, String code, String phone) {
        aliasInput.clear();
        aliasInput.sendKeys(alias);

        addressInput.clear();
        addressInput.sendKeys(address);

        cityInput.clear();
        cityInput.sendKeys(city);

        codeInput.clear();
        codeInput.sendKeys(code);

        countryList.click();
        countryUK.click();

        phoneInput.clear();
        phoneInput.sendKeys(phone);

        submitBtn.click();
    }
}
