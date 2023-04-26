package com.github.alrumbl4.mobile_test_mishka.helpers;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.github.alrumbl4.mobile_test_mishka.driver.RealMobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HelperMethods extends WebDriverRunner {

    static AndroidDriver driver = (AndroidDriver) driver().getWebDriver();

    //Метод для ввода клавиши
    public static void enterAndroidKey(AndroidKey androidKey) {
        driver.pressKey(new KeyEvent(androidKey));
    }

    //Метод для закрытия клавиатуры
    public static void closeKeyBoard() {
        if(driver.isKeyboardShown()) {
            driver.hideKeyboard();
        }
    }
    //Метод для получения атрибута SelenidElementa
    public static String getAtributElement(SelenideElement element, String text) {
        String result = element.getAttribute(text);
        return result;
    }
}
