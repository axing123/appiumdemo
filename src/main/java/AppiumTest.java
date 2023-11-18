import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumTest {
    public static AndroidDriver androidDriver;

    public static void main(String[] args) throws MalformedURLException {
        startApp();
        toClick();


    }

    public static void startApp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("NAB5T20321010931")
                .setPlatformName("android")
                .setAppPackage("com.example.demoappium")
                .setAppActivity("com.example.demoappium.MainActivity")
                .eventTimings();


        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","NAB5T20321010931");
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("appPackage","com.example.demoappium");
        desiredCapabilities.setCapability("appActivity","com.example.demoappium.MainActivity");
         androidDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);


    }

     @Test
    public static void toClick()   {
        //androidDriver.findElement(AppiumBy.accessibilityId("同意")).click();

        WebElement webElement=androidDriver.findElement(AppiumBy.id("com.example.demoappium:id/ed_user_phone"));
        webElement.sendKeys("15574902658");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        androidDriver.findElement(AppiumBy.id("com.example.demoappium:id/btn_longin")).click();



    }
}