package com.github.alrumbl4.mobile_test_mishka.tests;

import com.github.alrumbl4.mobile_test_mishka.helpers.HelperMethods;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты для страницы авторизации")
public class AuthorizationPageTest extends TestBase {

    @Test
    @DisplayName("Успешная авторизация по номеру телефона")
    public void successfulAuthorizationByPhoneNumber() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clickAnotherWayButton();
        authorizationPage.clickPhoneNumberButton();
        authorizationPage.setPhoneNumber("номер телефона");
        authorizationPage.clickOnNextButtonOnAuthorizationPage();
        connectionPage.clickUseGeoButton();
        connectionPage.getConnectionPageHeader();
    }

    @Test
    @DisplayName("Успешная авторизация через Google")
    public void successfulAuthorizationByGoogle() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clickGoogleButton();
        authorizationPage.clickGoogleAccount("почта");
        connectionPage.clickUseGeoButton();
        connectionPage.getConnectionPageHeader();
    }

    @Test
    @DisplayName("Успешная авторизация через Apple")
    public void succesfulAuthorizationByApple() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clickAnotherWayButton();
        authorizationPage.clickAppleButton();
        authorizationPage.setAppleId("test");
        HelperMethods.enterAndroidKey(AndroidKey.ENTER);
        authorizationPage.setApplePassword("test");
        HelperMethods.enterAndroidKey(AndroidKey.ENTER);
        connectionPage.clickUseGeoButton();
        connectionPage.getConnectionPageHeader();
    }

    @Test
    @DisplayName("Переход в почтовик с экрана 'Авторизация'")
    public void clickOnTheHelpButtonAndGoToTheMailer() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clickHelpButton();
        gmailPage.clickOkButtonOnGmailPage();
        gmailPage.checkingTextInTheFieldFromWhom("почта отправителя");
        gmailPage.checkingTextInTheToField("Support MISHKA");
        gmailPage.checkingTextTitle("Обращение в Умный Мишка");
        gmailPage.checkingBodyText("Номер умного Мишки");
    }

    @Test
    @DisplayName("Открывается политика конфиденциальности")
    public void privacyPolicyPageOpens() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clickingPrivacyPolicyAndCheckText();
    }

    @Test
    @DisplayName("Скролл политики конфиденциальности")
    public void privacyPolicyScroll() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clickingPrivacyPolicyAndCheckText();
        authorizationPage.scrollToEndThePrivacyPolicyText();
    }

    @Test
    @DisplayName("Выход из политики конфиденциальности на предыдущую страницу")
    public void exitThePrivacyPolicyToThePreviousPage() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clickingPrivacyPolicyAndCheckText();
        basePage.clickingBackButton();
        authorizationPage.checkingHeaderAuthorizationPage();
    }

    @Test
    @DisplayName("Открывается пользовательское соглашение")
    public void userAgreementPageOpens() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clicingkUserAgreementAndCheckText();
    }

    @Test
    @DisplayName("Скролл пользовательского соглашения")
    public void userAgreementScroll() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clicingkUserAgreementAndCheckText();
        authorizationPage.scrollToEndTheUserAgreementText();
    }

    @Test
    @DisplayName("Выход из пользовательского соглашения на предыдущую страницу")
    public void exitTheUserAgreementToThePreviousPage() {
        launcherPage.clickingIHaveTeddyButton();
        authorizationPage.clicingkUserAgreementAndCheckText();
        basePage.clickingBackButton();
        authorizationPage.checkingHeaderAuthorizationPage();
    }

    @Test
    @DisplayName("Выход со страницы авторизации на страницу запуска")
    public void exitAuthorizationPageToTheLauncherPage() {
        launcherPage.clickingIHaveTeddyButton();
        basePage.clickingBackButton();
        launcherPage.checkingHeaderLauncherPage();
    }
}
