package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SocialGroupTest extends TestBase {
    @Test
    @Tag("SocialGroupTest")
    @Feature("Проверка содержимого социальных групп")
    @Story("Открытие страницы и проверка страниц в соц.сетях ВК и Telegram")
    public void telegramVkOpenPages() {
        basePage.openPage();
        socialGroupPage.vkOpen();
        socialGroupPage.vkCheckTitle();
        socialGroupPage.telegramOpen();
        socialGroupPage.telegramCheckTitle();
    }
}
