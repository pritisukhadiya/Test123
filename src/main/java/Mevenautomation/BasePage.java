package Mevenautomation;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    protected static WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();

        // The implicit wait is set for the life of the WebDriver object instance.
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //Asking Driver to get the URL.
        driver.get("https://demo.nopcommerce.com/");

        //driver manage the window maximize.
        driver.manage().window().maximize();

    }

    @After
    public void closeBrowser()
    {
        driver.close();
    }

}
