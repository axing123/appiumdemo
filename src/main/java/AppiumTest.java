import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumTest {

    public AndroidDriver androidDriver;


    @BeforeTest
    public void startApp() {
        androidDriver = CommonUtils.getAndroidDriver();

    }


    @Test
    public void toClick() {
        //androidDriver.findElement(AppiumBy.accessibilityId("同意")).click();
        WebElement webElement = androidDriver.findElement(AppiumBy.id("com.example.demoappium:id/ed_user_phone"));
        webElement.sendKeys("15574902658");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        androidDriver.findElement(AppiumBy.id("com.example.demoappium:id/btn_longin")).click();

    }

    @AfterTest
    public void stopDriver(){
        androidDriver.close();
    }
}