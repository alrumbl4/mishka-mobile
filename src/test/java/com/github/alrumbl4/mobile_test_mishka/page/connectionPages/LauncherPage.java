package com.github.alrumbl4.mobile_test_mishka.page.connectionPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class LauncherPage {

    private SelenideElement
            headerLauncherPage = $(By.xpath("//android.view.ViewGroup/android.widget.TextView[1][@text='Давай дружить!']")),
            buttonIHaveTeddy = $(By.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")),
            buttonWhyBearIsSmart = $(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView"));


    @Step("Проверить заголовок страницы запуска")
    public LauncherPage checkingHeaderLauncherPage() {
        headerLauncherPage.shouldHave(Condition.exactText("Давай дружить!"));
        return this;
    }

    @Step("Клик по кнопке 'У меня есть Умный Мишка'")
    public AuthorizationPage clickingIHaveTeddyButton() {
        buttonIHaveTeddy.shouldHave(Condition.visible, Duration.ofSeconds(90)).click();
        return new AuthorizationPage();
    }

    @Step("Клик по кнопке 'Почему Мишка Умный'")
    public AuthorizationPage clickingWhyBearIsSmartButton() {
        buttonWhyBearIsSmart.shouldHave(Condition.visible, Duration.ofSeconds(90)).click();
        return new AuthorizationPage();
    }
}

