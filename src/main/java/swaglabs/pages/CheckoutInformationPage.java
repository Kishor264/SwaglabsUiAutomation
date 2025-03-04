package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationPage
{
    private WebDriver driver;
    private By firstname = By.cssSelector("#first-name");
    private By lastname = By.cssSelector("#last-name");
    private By postalcode = By.cssSelector("#postal-code");
    private By continuebutton = By.cssSelector("input[value='CONTINUE']");

    public CheckoutInformationPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public CheckoutOverviewPage filldetails(String fname,String lname,String postcode)
    {
        driver.findElement(firstname).sendKeys(fname);
        driver.findElement(lastname).sendKeys(lname);
        driver.findElement(postalcode).sendKeys(postcode);
        driver.findElement(continuebutton).click();
        return new CheckoutOverviewPage(driver);
    }
}
