import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
        androidDriver.quit();
    }
}