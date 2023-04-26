package com.github.alrumbl4.mobile_test_mishka.page.demoModePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class StoriesPage {

    private String storisTimeline = "//android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";

    @Step("Проверяем какая по номеру сторис сейчас отображается")
    public StoriesPage checkingTheHistoryNumber(String numberStories) {
        String newStorisTimeLine = storisTimeline + numberStories;
        SelenideElement element = $(By.xpath(newStorisTimeLine));
        element.shouldBe(Condition.selected);
        return this;
        }
    }
