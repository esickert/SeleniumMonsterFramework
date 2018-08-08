package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    WebDriver driver;
    @BeforeClass
    public void setupApplication()
    {
        Reporter.log("=====Browser Session Started=====", true);

        System.setProperty("webdriver.chrome.driver", "c://SeleniumDrivers//chromedriver.exe");
        //       WebDriver driver = new ChromeDriver();
        driver=new ChromeDriver();////////
        driver.manage().window().maximize();
        driver.get("https://login20.monster.com/Login/SignIn?re=swoop&ch=MONS&intcid=skr_swoop_h1&r=http%3A%2F%2Fhome.monster.com%2F");

        Reporter.log("=====Application Started=====", true);
    }


    @AfterClass
    public void closeApplication()
    {
//            driver.quit();
        Reporter.log("=====Browser Session End=====", true);

    }
}
