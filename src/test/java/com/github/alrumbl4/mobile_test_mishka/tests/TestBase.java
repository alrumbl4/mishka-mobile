package com.github.alrumbl4.mobile_test_mishka.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.appium.SelenideAppium;
import com.github.alrumbl4.mobile_test_mishka.page.*;
import com.github.alrumbl4.mobile_test_mishka.page.connectionPages.AuthorizationPage;
import com.github.alrumbl4.mobile_test_mishka.page.connectionPages.ConnectionPage;
import com.github.alrumbl4.mobile_test_mishka.page.connectionPages.GmailPage;
import com.github.alrumbl4.mobile_test_mishka.page.connectionPages.LauncherPage;
import com.github.alrumbl4.mobile_test_mishka.page.demoModePages.StoriesPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.github.alrumbl4.mobile_test_mishka.helpers.RunHelper.runHelper;

public class TestBase {
    protected static LauncherPage launcherPage;
    protected static AuthorizationPage authorizationPage;
    protected static ConnectionPage connectionPage;
    protected static GmailPage gmailPage;
    protected static BasePage basePage;
    protected static StoriesPage storiesPage;

    @BeforeAll
    public static void setup() {
        Configuration.browser = runHelper().getDriverClass().getName();
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "eager";
        launcherPage = new LauncherPage();
        authorizationPage = new AuthorizationPage();
        connectionPage = new ConnectionPage();
        gmailPage = new GmailPage();
        basePage = new BasePage();
        storiesPage = new StoriesPage();
    }

    @BeforeEach
    public void openDriver() {
        SelenideAppium.launchApp();
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
