package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
    private WebDriver driver;
    private By clickonbutton = By.cssSelector(".btn_primary.btn_inventory");
    private By carticon = By.cssSelector(".fa-layers-counter.shopping_cart_badge");

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckoutPage addtocart() {
        driver.findElement(clickonbutton).click();
        driver.findElement(carticon).click();
        return new CheckoutPage(driver);
    }
}
