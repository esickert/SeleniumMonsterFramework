package framework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.*;

public class Login extends BaseClass
    //uses inheritance to login to
{
    @Test(description = "This TC will perform valid login")
    public void loginToApplication() throws Throwable {
//            driver.findElement(By.name("txtUsername")).sendKeys("Admin1");
        driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("test@paris.com");

//            driver.findElement(By.id("txtPassword")).sendKeys("admin1");
        driver.findElement(By.cssSelector("#Password")).sendKeys("Paris111");

        driver.findElement(By.cssSelector("#btn-login")).click();
        Thread.sleep(5000);

        System.out.println(driver.manage().getCookies());

        //           driver.navigate().back();   doesn't work

        Thread.sleep(5000);

    }  //loginToApplication


/*   @Test(description="This TC will perform invalid login",enabled = false)
    public void loginToApplication1()
    {
            driver.findElement(By.name("txtUsername")).sendKeys("admin1");

            driver.findElement(By.id("txtPassword")).sendKeys("admin2");

            driver.findElement(By.id("btn-Login")).click();
    }
*/

    @Test(description = "This test case will logout")
    public void logoutOfApplication() {

        WebElement dropDown = driver.findElement(By.cssSelector("#mobile-navbar-search > ul > li > a"));
        dropDown.click();

        System.out.println("I am here inside logoutOfApplication line 46 " + dropDown.getText());

        WebElement logout = driver.findElement(By.cssSelector("#mobile-navbar-search > ul > li > ul > li:nth-child(8) > a"));
        System.out.println(logout.getText());
        logout.click();
    }
}



