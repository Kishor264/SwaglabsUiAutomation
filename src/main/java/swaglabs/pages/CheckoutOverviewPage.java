package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage
{
    private WebDriver driver;
    private By finishbutton = By.cssSelector(".btn_action.cart_button");

    public CheckoutOverviewPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public CheckoutCompletePage clickonfinishbutton()
    {
        driver.findElement(finishbutton).click();
        return new CheckoutCompletePage(driver);
    }

}
