package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage
{
    private WebDriver driver;
    private By thankyou = By.cssSelector(".complete-header");
    public CheckoutCompletePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public String verifyorderplacedsuccessfully()
    {
       return driver.findElement(thankyou).getText();
    }
}
