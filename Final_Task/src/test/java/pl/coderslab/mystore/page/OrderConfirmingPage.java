package pl.coderslab.mystore.page;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class OrderConfirmingPage {
    private WebDriver driver;

    public OrderConfirmingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "content-hook_payment_return")
    private WebElement orderConfirmationContainer;

    public void screenShoot() throws IOException {
        // Get screenshot of the web page
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Convert the screenshot into BufferedImage
        BufferedImage fullScreen = ImageIO.read(screenshot);
        //Save Image
        FileUtils.copyFile(screenshot, new File("F:\\prtscr\\particularElementScreenshot.PNG"));
    }
}