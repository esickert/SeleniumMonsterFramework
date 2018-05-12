package framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseClass
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


/*        @Test(description="This TC will perform invalid login")
        public void loginToApplication1()
        {
            driver.findElement(By.name("txtUsername")).sendKeys("admin1");

            driver.findElement(By.id("txtPassword")).sendKeys("admin2");

            driver.findElement(By.id("btn-Login")).click();
        }   */
}
