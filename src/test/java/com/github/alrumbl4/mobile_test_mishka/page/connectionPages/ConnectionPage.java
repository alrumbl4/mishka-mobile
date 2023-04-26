package com.github.alrumbl4.mobile_test_mishka.page.connectionPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class ConnectionPage {
    private SelenideElement
            allowToUseGeoButton = $(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']")),
            connectionPageHeaderText = $(By.xpath("//android.widget.TextView[@text='Подключение к игрушке']"));

    @Step("Клик по кнопке 'Разрешить использовать местоположение'")
    public ConnectionPage clickUseGeoButton() {
        allowToUseGeoButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        return this;
    }

    @Step("Проверить заголовок страницы 'Connection Page'")
    public ConnectionPage getConnectionPageHeader() {
        connectionPageHeaderText.shouldHave(Condition.exactText("Подключение к игрушке"));
        return this;
    }
}
