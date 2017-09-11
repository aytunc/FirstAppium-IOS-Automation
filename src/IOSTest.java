import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.net.MalformedURLException;

public class IOSTest extends Practise {

    public static void main(String[] args) throws MalformedURLException {

        IOSDriver<IOSElement> driver=capabilities();
        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//*[@value='Text Entry']").click();
        driver.findElementByName("OK").click();
    }
}

