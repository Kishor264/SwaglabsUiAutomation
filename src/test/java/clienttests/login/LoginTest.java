package clienttests.login;

import clienttests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest

{
    @Test (priority = 0)
    public void validlogintest()
    {
        homePage.enterusername("standard_user")
                .enterpassword("secret_sauce")
                .loginbuttonclick();

        String result = loginPage.verifyloginpage();
        Assert.assertEquals(result,"Swag Labs");
        System.out.println(result);
    }
    @Test ()
    public void invalidlogintest()
    {
        homePage.enterpassword("newuser")
                .enterpassword("password")
                .loginbuttonclick();
        Boolean result = homePage.iserrormessagedisplayed();
        Assert.assertTrue(result);
        System.out.println(result);
    }


}
