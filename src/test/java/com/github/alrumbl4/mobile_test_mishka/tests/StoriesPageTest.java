package com.github.alrumbl4.mobile_test_mishka.tests;

import org.junit.jupiter.api.Test;

public class StoriesPageTest extends TestBase {
    @Test
    public void firstTest() {
        launcherPage.clickingWhyBearIsSmartButton();
        storiesPage.checkingTheHistoryNumber("[1]");
        storiesPage.checkingTheHistoryNumber("[2]");
    }

}