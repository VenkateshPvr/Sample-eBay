package com.ebay.core;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

        private DesiredCapabilities capabilities = new DesiredCapabilities();
        private static AndroidDriver androidDriver = null;

        private String appiumPort;
        private String serverIp;

        @BeforeClass
        public void setup(){
            initDriver();
        }

        public AndroidDriver getDriver() {
            return androidDriver;
        }

        protected AndroidDriver initDriver(){
            System.out.println("Inside initDriver method");

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM, "Android");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Asus");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
            cap.setCapability(MobileCapabilityType.APP, "apk file");
            cap.setCapability("noReset", true);
            String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";


            try
            {
                System.out.println("Argument to driver object : " + serverUrl);
                androidDriver = new AndroidDriver(new URL(serverUrl), capabilities);

            }
            catch (NullPointerException | MalformedURLException ex) {
                throw new RuntimeException("appium driver could not be initialised for device ");
            }
            System.out.println("Driver in initdriver is : "+androidDriver);
			return null;

        }

        @AfterClass
        public void tearDown(){
            androidDriver.quit();
}
}