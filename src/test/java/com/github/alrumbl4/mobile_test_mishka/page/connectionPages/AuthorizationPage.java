package com.github.alrumbl4.mobile_test_mishka.page.connectionPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {

    private final SelenideElement
            headerAuthorizationPage = $(By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[@text='Авторизация']")),
            helpButtonOnAuthorizationPage = $(By.xpath("//android.widget.TextView[@text='Помощь']")),
            userAgreementButton = $(By.xpath("//android.widget.TextView[@text='Пользовательское соглашение']")),
            userAgreementText = $(By.xpath("//android.widget.TextView[@text='ОБЩИЕ ПОЛОЖЕНИЯ']")),
            endOfTheUserAgreementText = $(By.xpath("//android.widget.ListView/android.view.View/android.widget.TextView[@text='ЗАКЛЮЧИТЕЛЬНЫЕ ПОЛОЖЕНИЯ']")),
            privacyPolicyButton = $(By.xpath("//android.widget.TextView[@text='Политика конфиденциальности']")),
            privacyPolicyText = $(By.xpath("//android.view.View[@text='Дата последнего изменения: 18.12.2018г.']")),
            endOfThePrivacyPolicyText = $(By.xpath("//android.widget.ListView/android.view.View/android.widget.TextView[@text='ОБРАЩЕНИЯ ПОЛЬЗОВАТЕЛЕЙ']")),
            authorizationInAnotherWayButton = $(By.xpath("//android.widget.TextView[@text='OR CONTINUE WITH ANOTHER WAY']")),
            authorizationByPhoneNumberButton = $(By.xpath("//android.widget.TextView[@text='ПО НОМЕРУ ТЕЛЕФОНА']")),
            phoneNumberField = $(By.xpath("//android.widget.EditText[@resource-id='text-input-outlined']")),
            authorizationPageNextButton = $(By.xpath("//android.widget.TextView[@text='ПРОДОЛЖИТЬ']")),
            authorizationByGoogleButton = $(By.xpath("//android.widget.TextView[@text='GOOGLE']")),
            accountNameGoogle = $(By.xpath("//android.widget.TextView[@resource-id='com.google.android.gms:id/account_name']")),
            authorizationByAppleButton = $(By.xpath("//android.widget.TextView[@text='SIGN IN WITH APPLE']")),
            appleIdField = $(By.xpath("//android.widget.EditText[@resource-id='account_name_text_field']")),
            applePasswordField = $(By.xpath("//android.widget.EditText[@resource-id='password_text_field']"));

    @Step("Проверить заголовок страницы авторизации")
    public AuthorizationPage checkingHeaderAuthorizationPage() {
        headerAuthorizationPage.shouldHave(Condition.exactText("Авторизация"));
        return this;
    }

    @Step("Клик по пользовательскому соглашению и проверка открытия документа")
    public AuthorizationPage clicingkUserAgreementAndCheckText() {
        userAgreementButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        userAgreementText.shouldHave(Condition.exactText("Общие положения"));
        return this;

    }

    @Step("Клик по политике конфиденциальности и проверка открытия документа")
    public AuthorizationPage clickingPrivacyPolicyAndCheckText() {
        privacyPolicyButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
        privacyPolicyText.shouldHave(Condition.exactText("Дата последнего изменения: 18.12.2018г."));
        return this;
    }

    @Step("Клик по кнопке 'Авторизоваться другим способом'")
    public AuthorizationPage clickAnotherWayButton() {
        authorizationInAnotherWayButton.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }

    @Step("Клик по кнопке 'Авторизация по номеру телефона'")
    public AuthorizationPage clickPhoneNumberButton() {
        authorizationByPhoneNumberButton.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }

    @Step("Клик по полю 'Номер телефона")
    public AuthorizationPage clickPhoneNumberField() {
        phoneNumberField.click();
        return this;
    }
    @Step("Ввод данных в поле 'Номер телефона'")
    public AuthorizationPage setPhoneNumber(String phoneNumber) {
        phoneNumberField.setValue(phoneNumber);
        return this;
    }

    @Step("Клик по кнопке 'Продолжить'")
    public AuthorizationPage clickOnNextButtonOnAuthorizationPage() {
        authorizationPageNextButton.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }

    @Step("Клик по кнопке 'Авторизация через Google'")
    public AuthorizationPage clickGoogleButton() {
        authorizationByGoogleButton.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }

    @Step("Клик по кнопке 'Авторизация через Apple'")
    public AuthorizationPage clickAppleButton() {
        authorizationByAppleButton.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }

    @Step("Выбор google аккаунта для авторизации")
    public AuthorizationPage clickGoogleAccount(String accountName) {
        accountNameGoogle.shouldHave(Condition.exactText(accountName), Duration.ofSeconds(5)).click();
        return this;
    }

    @Step("Ввод данных в поле 'Apple Id'")
    public AuthorizationPage setAppleId(String appleId) {
        appleIdField.click();
        appleIdField.setValue(appleId);
        return this;
    }

    @Step("Ввод данных в поле 'Apple password'")
    public AuthorizationPage setApplePassword(String applePassword) {
        applePasswordField.click();
        applePasswordField.shouldBe(Condition.visible, Duration.ofSeconds(5)).setValue(applePassword);
        return this;
    }

    @Step("Клик по кнопке 'Помощь'")
    public GmailPage clickHelpButton() {
        helpButtonOnAuthorizationPage.shouldBe(Condition.visible).click();
        return new GmailPage();
    }

    @Step("Скролл пользовательского соглашения")
    public AuthorizationPage scrollToEndTheUserAgreementText() {
        endOfTheUserAgreementText.scrollTo().shouldHave(Condition.exactText("ЗАКЛЮЧИТЕЛЬНЫЕ ПОЛОЖЕНИЯ"));
        return this;
    }

    @Step("Скролл политики конфиденциальности")
    public AuthorizationPage scrollToEndThePrivacyPolicyText() {
        endOfThePrivacyPolicyText.scrollTo().shouldHave(Condition.exactText("ОБРАЩЕНИЯ ПОЛЬЗОВАТЕЛЕЙ"));
        return this;
    }

}
