import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    AndroidDriver driver;
    public static final String PACKAGE_ID="com.google.android.calculator";
    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("devieName","emulator");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("appPackage",PACKAGE_ID);
        caps.setCapability("appActivity","com.android.calculator2.Calculator");
        caps.setCapability("app","D:\\Road to SDET (SQA)\\apk\\calculator.apk");
          URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;

    }
    @AfterTest
    public void quitDriver(){

        driver.quit();
    }



}
