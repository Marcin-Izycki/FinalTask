package pl.coderslab.mystore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")
    private WebElement continueAddressBtn;

    @FindBy(xpath = "//*[@id=\"js-delivery\"]/div/div[1]/div[1]/div/span/span")
    private WebElement shippingMethod;

    @FindBy(xpath = "//*[@id=\"js-delivery\"]/button")
    private WebElement continueShippingBtn;

    @FindBy(id = "payment-option-1")
    private WebElement paymentOptionSelect;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement termsOfServiceCheckbox;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement orderConfirmBtn;

    public void confirmAddress() {
        continueAddressBtn.click();
    }

    public void confirmShippingMethod() {
        shippingMethod.click();
        continueShippingBtn.click();
    }

    public void confirmPayment() {
        paymentOptionSelect.click();
        termsOfServiceCheckbox.click();
    }

    public void finishOrder() {
        orderConfirmBtn.click();
    }
}
