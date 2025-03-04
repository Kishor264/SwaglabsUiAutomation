package clienttests.cart;

import clienttests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest
{
    @Test
    public void buyproduct()
    {
        homePage.enterusername("standard_user")
                .enterpassword("secret_sauce")
                .loginbuttonclick();
        inventoryPage.selectProduct("Sauce Labs Fleece Jacket");
        productDetailsPage.addtocart();
        checkoutPage.clickoncheckout();
        checkoutInformationPage.filldetails("kishor","kulkarni","123456");
        checkoutOverviewPage.clickonfinishbutton();
       String result = checkoutCompletePage.verifyorderplacedsuccessfully();
        Assert.assertEquals(result,"THANK YOU FOR YOUR ORDER");
    }

}
