package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.*;

public class Login extends BaseClass
    //uses inheritance to login to
{
    @Test(description="This TC will perform valid login")
    public void loginToApplication() throws Throwable
    {
//            driver.findElement(By.name("txtUsername")).sendKeys("Admin1");
        driver.findElement(By.cssSelector("#EmailAddress")).sendKeys("esickert@gmail.com");

//            driver.findElement(By.id("txtPassword")).sendKeys("admin1");
        driver.findElement(By.cssSelector("#Password")).sendKeys("Claude111");

        driver.findElement(By.cssSelector("#btn-login")).click();
        Thread.sleep(5000);

        //           driver.navigate().back();   doesn't work

        Thread.sleep(5000);
    }


   @Test(description="This TC will perform invalid login",enabled = false)
    public void loginToApplication1()
    {
            driver.findElement(By.name("txtUsername")).sendKeys("admin1");

            driver.findElement(By.id("txtPassword")).sendKeys("admin2");

            driver.findElement(By.id("btn-Login")).click();
    }

    @Test(description="This test case will logout")
    public void logoutOfApplication()   {

            WebElement dropDown = driver.findElement(By.cssSelector("#mobile-navbar-search > ul > li > a"));
            dropDown.click();
            List<WebElement> options = dropDown.findElements(By.tagName("li"));
            System.out.println("Total selected rows are " + options.size());

//            WebElement dd2 = driver.findElement(By.className("dropdown-toogle.navbar-icon-link.loginLink2"));
   //         dd2.click();
            System.out.println(dropDown.getText());

            driver.findElement(By.cssSelector("#mobile-navbar-search > ul > li > ul > li:nth-child(8) > a")).click();

//            List<WebElement> options = dd2.findElements(By.tagName("li"));
            System.out.println(options);
    }
}
