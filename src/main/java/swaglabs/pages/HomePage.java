package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    private WebDriver driver;
    private By username = By.cssSelector("#user-name");
    private By password = By.cssSelector("#password");
    private By loginbutton  = By.cssSelector("#login-button");
    private By Errormessage = By.cssSelector("h3[data-test='error']");

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public HomePage enterusername(String usrnm)
    {
         driver.findElement(username).sendKeys(usrnm);
         return new HomePage(driver);
    }

    public HomePage enterpassword(String paswd)
    {
        driver.findElement(password).sendKeys(paswd);
        return  new HomePage(driver);
    }
    public LoginPage loginbuttonclick()
    {
        driver.findElement(loginbutton).click();
        return  new LoginPage(driver);
    }
    public Boolean iserrormessagedisplayed()
    {
        return driver.findElement(Errormessage).isDisplayed();

    }

}
