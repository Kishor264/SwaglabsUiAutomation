package swaglabs.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage
{
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public String verifyloginpage()
    {
        return driver.getTitle();
    }
}
