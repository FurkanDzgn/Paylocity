package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


    // create a method for fluent wait

    public static WebElement fluentWait(WebDriver driver, long totalSec, long pollingSecond, By locator){

        Wait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(totalSec))
                .pollingEvery(Duration.ofSeconds(pollingSecond))
                .ignoring(RuntimeException.class);


        return  wait.until( driver1 -> driver1.findElement(locator));
    }

    public static WebElement visibilityOf(WebDriver driver,int timeInSecond ,WebElement element){

        WebDriverWait wait=new WebDriverWait(driver,timeInSecond);

        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement visibilityOfElementLocator(WebDriver driver,int timeInSecond,By locator ){

        WebDriverWait wait=new WebDriverWait(driver,timeInSecond);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static String takeScreenShot() { // throws IOException

        // First we cast driver to TakesScreenshot
        // We get the screeshot as FILE
        File src=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        // We need the destination to store all my screenshots

        // System.getProperty("user.dir") will give the project location
        // C:\Users\12242\IdeaProjects\CucumberBatch4
        // System.currentTimeMillis() helps us to give unique name for my screenshot
                             //                             /Screenshot/ --> mac user
        String destination=System.getProperty("user.dir")+"\\Screenshot\\"+System.currentTimeMillis()+".png";

        File des=new File(destination);

        try{
            // copyFile get the file from source store to the destination
            FileUtils.copyFile(src,des);
        }catch (IOException e){
            e.printStackTrace();
        }
//        catch (Exception en){
//            en.printStackTrace();
//        }

        return destination;
    }

    public static double calculateNetPay(int dep){

        double result = ((1000)+(dep*500))/26;
        return result;
    }



}


