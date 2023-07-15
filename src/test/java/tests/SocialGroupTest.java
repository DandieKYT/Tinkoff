package tests;

import org.junit.jupiter.api.Test;

public class SocialGroupTest extends TestBase {
    @Test
    public void telegramVkOpenPages() {
        basePage.openPage();
        socialGroupPage.vkOpen();
        socialGroupPage.vkCheckTitle();
        socialGroupPage.telegramOpen();
        socialGroupPage.telegramCheckTitle();
    }
}
