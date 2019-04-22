package Mevenautomation;

import Mevenautomation.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.bind.Element;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    static String actualResult;


    //1)    Clicking element
    public static void clickElementBy(By by) {
        BasePage.driver.findElement(by).click();
    }


    //2)   Clear Text form inout box/area
    public static void clearfield(By by) {
        BasePage.driver.findElement(by).clear();
    }


    // 3)   Enter text in input field
    public static void enterText(By by, String text) {
        BasePage.driver.findElement(by).sendKeys(text);
    }

    //4)   Clear and enter text in input field
    public void clearAndEnter(By by, String text) {
        BasePage.driver.findElement(by).clear();
        BasePage.driver.findElement(by).sendKeys(text);
    }


    // 5) Checking WebElemnt present in DOM
    public boolean isElementPresent(By by) {
        try {
            BasePage.driver.findElement(by).isEnabled();
            return true;

        } catch (NoSuchElementException e) {
            return false;
        }
    }

    // 6)    Checking WebElemnt displayed or not
    public boolean isElementDisplayed(By by) {
        try {
            BasePage.driver.findElement(by).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    //7)   Wait for fixed time given in seconds
    public static void waitForWebElemeniToBeClickable(WebElement element, int second) {
        WebDriverWait wait = new WebDriverWait(BasePage.driver, second);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //8)  Try to click element three times if not available in first go
    public boolean retryForElement(By by) {
        boolean result = false;
        int attempt = 0;
        while (attempt < 3) {
            try {
                Thread.sleep(10);
                BasePage.driver.findElement(by).click();
                result = true;
                break;
            } catch (Exception e) {

            }
            attempt++;

        }
        return result;
    }

    //9) is dorpdown present


    // 10)  Wait for locator to be clickable for given time in seconds
    public static void waitForLocatorToBeClickable(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(BasePage.driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }


    //11)  Wait for element to be clickable for given time in seconds


    //12) date stamp short

    //13)  date stamp long


    //14)  Wait for visibility of element for given time in second
    public static void explicitWaitForVisibility(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(BasePage.driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //15)  wait for  element to be invisible


    //16)   select from visible text

    //17)  Select from visible number


    //18)  Select text from value
    public static String getActualText(By by) {
        return actualResult = BasePage.driver.findElement(by).getText();

    }

    //19)  get selected value from dropdown
    public static void selectByValue(By by, String data) {
        Select dob = new Select(BasePage.driver.findElement(by));
        dob.selectByValue(data);
    }



    //20 scroll to view element
    public void scrollToElementImplicit(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    //21)  Scroll to element and click
    public void scrollToElementFoundAndClick(By by, WebElement element) {
        ((JavascriptExecutor) BasePage.driver).executeScript("arguments[0].scrollIntoView(true);", element);
        BasePage.driver.findElement(by).click();
    }

    //22)  Wait for alert to display
    public boolean isAlertPresent() {
        boolean present = false;
        try {
            //check the presence of alert
            Alert alert = BasePage.driver.switchTo().alert();
            //Alert present;set th flag
            present = true;
            //if present consume the alert
            alert.accept();
        } catch (NoAlertPresentException ex) {
            //Alert not present
            ex.printStackTrace();
        }
        return present;
    }

    //23)  Get attribute of element
    public static String getAtributeOfElement(WebElement element, String css) {
        String value = element.getCssValue(css);
        return value;
    }

    //24)  get css property of element
    public String getCssPropertyOfElement(WebElement element, String css) {
        String value = element.getCssValue(css);
        return value;
    }

    //25)  take screenshot of browser


    //26)  take screenshot of current display(full)


    //27)  convert date....




}
