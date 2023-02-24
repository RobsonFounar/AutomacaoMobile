package br.com.ideamaker.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumDriverHelper {

	private static AppiumDriver<MobileElement> driver;

	public static AppiumDriver<MobileElement> createDriver(String plataform, ConfigSistema configSistema) throws MalformedURLException {
		if (driver == null) {
			if (plataform.equalsIgnoreCase("android")) {
				DesiredCapabilities config = new DesiredCapabilities();
				config.setCapability(MobileCapabilityType.APP, configSistema.getAndroid().getAPP());
				config.setCapability(MobileCapabilityType.PLATFORM_NAME, configSistema.getAndroid().getPLATFORM_NAME());
				config.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, configSistema.getAndroid().getAPP_PACKAGE());
				config.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, configSistema.getAndroid().getAPP_ACTIVITY());
				config.setCapability(MobileCapabilityType.DEVICE_NAME, configSistema.getAndroid().getDEVICE_NAME());
				config.setCapability(MobileCapabilityType.PLATFORM_VERSION, configSistema.getAndroid().getPLATFORM_VERSION());
				config.setCapability(MobileCapabilityType.AUTOMATION_NAME, configSistema.getAndroid().getAUTOMATION_NAME());
				driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), config);
			} else if (plataform.equalsIgnoreCase("ios")) {
				DesiredCapabilities config = new DesiredCapabilities();
				config.setCapability(MobileCapabilityType.APP, configSistema.getIos().getAPP());
				config.setCapability(MobileCapabilityType.PLATFORM_NAME, configSistema.getIos().getPLATFORM_NAME());
				config.setCapability(MobileCapabilityType.DEVICE_NAME, configSistema.getIos().getDEVICE_NAME());
				config.setCapability(MobileCapabilityType.PLATFORM_VERSION, configSistema.getIos().getPLATFORM_VERSION());
				driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), config);
			}
		}

		return driver;
	}

	public static void closeDriver() {
		driver.quit();
	}

	public static void relaunchApp() {
		driver.launchApp();
	}
}