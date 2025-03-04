package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage
{
    private WebDriver driver;
    private By productname =  By.cssSelector(".inventory_item_name");//6 items
    public InventoryPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public ProductDetailsPage selectProduct(String product)
    {
        List<WebElement> products = driver.findElements(productname);
        for(int i=0 ; i < products.size() ; i++)
        {
          if(product.equalsIgnoreCase(products.get(i).getText()))
          {
              products.get(i).click();
              break;
          }
        }

        return new ProductDetailsPage(driver);
    }
}
