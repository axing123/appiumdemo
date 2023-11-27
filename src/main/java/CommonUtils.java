import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CommonUtils {

    public static AndroidDriver androidDriver;

    public static AndroidDriver getAndroidDriver()  {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("NAB5T20321010931")
                .setPlatformName("android")
                .setAppPackage("com.example.demoappium")
                .setAppActivity("com.example.demoappium.MainActivity")
                .eventTimings();
        //配置启动的app
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","NAB5T20321010931");
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("automationName","Uiautomator2");
        desiredCapabilities.setCapability("appPackage","com.example.demoappium");
        desiredCapabilities.setCapability("appActivity","com.example.demoappium.MainActivity");
        try {
            androidDriver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return androidDriver;
    }
}
