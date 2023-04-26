package com.github.alrumbl4.mobile_test_mishka.page.connectionPages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class GmailPage {

    private SelenideElement
            okButtonPopUpGooglePlay = $(By.id("android:id/button1")),
            fieldFromWhom = $(By.id("com.google.android.gm:id/from_account_name")),
            toField = $(By.id("com.google.android.gm:id/to")),
            textTitle = $(By.id("com.google.android.gm:id/subject")),
            bodyText = $(By.xpath("//android.webkit.WebView/android.widget.EditText"));

    @Step("Клик по кнопке 'ok в поп ап от google play")
    public GmailPage clickOkButtonOnGmailPage() {
        okButtonPopUpGooglePlay.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Проверка текста в поле 'От кого'")
    public GmailPage checkingTextInTheFieldFromWhom(String sendersEmail) {
        fieldFromWhom.shouldHave(Condition.exactText(sendersEmail));
        return this;
    }

    @Step("Проверка текста в поле 'Кому'")
    public GmailPage checkingTextInTheToField(String recipientEmail) {
        toField.shouldHave(Condition.text(recipientEmail));
        return this;
    }

    @Step("Проверка заголовка текста сообщения")
    public GmailPage checkingTextTitle(String textHeader) {
        textTitle.shouldHave(Condition.text(textHeader));
        return this;
    }

    @Step("Проверка тела сообщения")
    public GmailPage checkingBodyText(String textBody) {
        bodyText.shouldHave(Condition.text(textBody));
        return this;
    }
}
