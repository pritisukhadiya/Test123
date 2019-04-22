package Mevenautomation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class nopCom extends Utils {
/*
    //protected static WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\ThirdMaven\\chromedriver.exe");
        driver = new ChromeDriver();

        // The implicit wait is set for the life of the WebDriver object instance.
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        //Asking Driver to get the URL.
        driver.get("https://demo.nopcommerce.com/");

        //driver manage the window maximize.
        driver.manage().window().maximize();

    }
*/
    //1.user should be able to register successfully
    @Test
    public void userShouldBeRegisterSuccessfully()
    {
        //Register for a new user
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //click on radio button
        driver.findElement(By.xpath("//label[@class='forcheckbox']")).click();

        //Enter First Name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rishi");

        //Enter Last Name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("shah");

        //Select DateOfBirth use Dropdown menu
        Select sel1=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        sel1.selectByValue("25");
        Select sel2=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
        sel2.selectByVisibleText("October");
        Select sel3=new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        sel3.selectByIndex(9);

        //Enter Email_ID
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rishi.shah5"+"@yahoo.com");

        //Enter Password
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("rishi1234");

        //Enter Confirm Password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("rishi1234");

        //Click on Registration Button
        driver.findElement(By.xpath("//input[@id='register-button']")).click();

        //for New User Registration
        //Assert Expected = Actual
        String successmsg = "Your registration completed";
        String actualRegistrationSuccessMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals(successmsg,actualRegistrationSuccessMessage);


    }

    //2.User should be able to navigate to Nootebook catetory page(Computer>>Notebooks)
    @Test
    public void userShouldNavigateBook()
    {
        //Main menu Item (Computers) x path stored in variable
        WebElement web_Element_To_Be_Hovered = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));

        //Create object hover
        Actions hover = new Actions(driver);

        //code to perform hovering task
        hover.moveToElement(web_Element_To_Be_Hovered).build().perform();

        //Click on Notebooks
        driver.findElement(By.xpath("//html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")).click();

        //create successmsg variable to store expected Result element
        String Successmsg = "Notebooks";

        //create variable to store actual element.
        String actualComputerToNootebooksMessage = driver.findElement(By.xpath("//html/body/div[6]/div[3]/div[1]/ul/li[3]/strong")).getText();

        //compare Actual vs Expected
        Assert.assertEquals(Successmsg,actualComputerToNootebooksMessage);

        //print Actual result.
        System.out.println("Page is  "  + actualComputerToNootebooksMessage);

    }
//3.User should be able to navigate cell phone page via Electronics>>Cellpohone

    @Test
    public void userShouldNavigateCellPhone() {
        //Main menu Item (Electronics) x path stored in variable
        WebElement web_Element_To_Be_Hovered = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));

        //Create object hover
        Actions hover = new Actions(driver);

        //code to perform hovering task
        hover.moveToElement(web_Element_To_Be_Hovered).build().perform();

        //Click on Cell Phones
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a")).click();

        //create successmsg variable to store expected Result element
        String Successmsg = "Cell phones";

        //create variable to store actual element.
        String actualElectronicsToCellPhone = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[2]/div/div[1]/h1")).getText();

        //compare Actual vs Expected
        Assert.assertEquals(Successmsg, actualElectronicsToCellPhone);

        //print Actual result.
        System.out.println("Page is  " + actualElectronicsToCellPhone);
    }
//4. User should be able to login Successfully.

    @Test
    public void userLogin()
    {
        //Click on Login
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        // Enter Email_ID
        driver.findElement(By.xpath("//input[@class='email']")).sendKeys("bhavna.rajput3"+"@yahoo.com");

        //Enter  Password
        driver.findElement(By.xpath("//input[@class='password']")).sendKeys("bhavu999999");


        //Click Login button
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

        //My account menu Item should be visible
        driver.findElement(By.xpath("//a[@class='ico-account']")).isEnabled();

        //compare Expected vs Actual
        Assert.assertEquals("My account", driver.findElement(By.xpath("//a[@class='ico-account']")).getText());

        //Print text
        System.out.println(driver.findElement(By.xpath("//a[@class='ico-account']")).getText());


    }
//5. User should be able to add product to shopping cart

    @Test
    public void addShoppingCart()
    {
        //Main menu Item (Electronics) x path stored in variable
        WebElement web_Element_To_Be_Hovered = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));

        //Create object hover
        Actions hover = new Actions(driver);

        //code to perform hovering task
        hover.moveToElement(web_Element_To_Be_Hovered).build().perform();

        //Click on Cell Phones
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a")).click();

        //Add Product to Sopping Cart
        //Click on ADD TO CART
        driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();

        //compare Expected vs Actual
        Assert.assertEquals("The product has been added to your shopping cart", driver.findElement(By.xpath("//p[@class='content']")).getText());

        //Msg display
        System.out.println(driver.findElement(By.xpath("//p[@class='content']")).getText());
    }
/*
    @After
    public void closeBrowser()
    {
        driver.close();
    }
*/
}
