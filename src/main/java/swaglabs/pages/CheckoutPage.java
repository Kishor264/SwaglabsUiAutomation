package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage
{
    private WebDriver driver;
    private By checkoutbutton = By.cssSelector(".btn_action.checkout_button");
    public CheckoutPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public CheckoutInformationPage clickoncheckout()
    {
        driver.findElement(checkoutbutton).click();
        return new CheckoutInformationPage(driver);
    }
}
