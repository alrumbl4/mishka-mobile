package com.github.alrumbl4.mobile_test_mishka.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class BasePage {
    private SelenideElement
            backButton = $(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup"));

    @Step("Клик по кнопке 'Назад'")
    public BasePage clickingBackButton() {
        backButton.click();
        return this;
    }

}
