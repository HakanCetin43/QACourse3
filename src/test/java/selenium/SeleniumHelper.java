package selenium;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static selenium.LocatorMethods.*;

public class SeleniumHelper {
    public static void navigatesHelper(String url){
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    public static void entersToAreaHelper(String input, String element) throws InterruptedException {
        locateElements(element).sendKeys(input+Keys.ENTER);
        Thread.sleep(2000);
    }
    public  static void userViewsHelper(String element){
        boolean displayed = locateElements(element).isDisplayed();
        Assert.assertEquals(true, displayed);
    }
    public static void userShouldSeePageHelper(String element){
        boolean displayed = locateElements(element).isDisplayed();
        Assert.assertEquals(true, displayed);
    }
    public static void clicksHelper(String element) throws InterruptedException {
        locateElements(element).click();
        Thread.sleep(2000);
    }




}
