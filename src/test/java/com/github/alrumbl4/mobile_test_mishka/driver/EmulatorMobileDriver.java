package com.github.alrumbl4.mobile_test_mishka.driver;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

import static com.github.alrumbl4.mobile_test_mishka.config.ConfigReader.EMULATOR_CONFIG;
import static com.github.alrumbl4.mobile_test_mishka.helpers.GetAbsolutePath.getAbsolutePath;

public class EmulatorMobileDriver implements WebDriverProvider {

    protected static AndroidDriver driver;
    private static final String DEVICE_NAME = EMULATOR_CONFIG.deviceName();
    private static final String PLATFORM_NAME = EMULATOR_CONFIG.platformName();
    private static final String PLATFORM_VERSION = EMULATOR_CONFIG.platfromVersion();
    private static final String APP_PACKAGE = EMULATOR_CONFIG.appPackage();
    private static final String APP_ACTIVITY = EMULATOR_CONFIG.appActivity();
    private static final String APP = EMULATOR_CONFIG.app();
    private static final String URL = EMULATOR_CONFIG.remoteURL();

    public static URL getUrl() {
        try {
            return new URL(URL);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setDeviceName(DEVICE_NAME);
        options.setPlatformName(PLATFORM_NAME);
        options.setPlatformVersion(PLATFORM_VERSION);
        options.setAppPackage(APP_PACKAGE);
        options.setAppActivity(APP_ACTIVITY);
        options.setApp(getAbsolutePath(APP));
        driver = new AndroidDriver(getUrl(), options);
        return driver;
    }
}
