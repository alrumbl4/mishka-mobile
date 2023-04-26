package com.github.alrumbl4.mobile_test_mishka.page.pagesWithConnection;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class OnbordingPage {
    private SelenideElement
            startOnbordingButton = $(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")),
            exitOnbordingButton = $(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")),
            yesButtonInTheConfirmationWindowCloseOnboarding = $(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView"));

    @Step("Проверить наличие кнопки 'Начать знакомство'")
    public OnbordingPage checkingTextOnOnbordingButton() {
        startOnbordingButton.shouldHave(Condition.exactText("Начать знакомство"));
        return this;
    }

    @Step("Клик по кнопке 'закрыть' в модальном окне онбординга")
    public OnbordingPage clickExitOnbordingButton() {
        exitOnbordingButton.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Клик по кнопке 'да' в модальном окне с просьбой подтвердить закрытие онбординга")
    public OnbordingPage clickYesButtonInTheConfirmationWindow() {
        yesButtonInTheConfirmationWindowCloseOnboarding.shouldBe(Condition.visible).click();
        return this;
    }
}
