package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DepositTest extends TestBase {
    @Test
    @Tag("DepositTest")
    @Feature("Открытие страницы Инвестии")
    @Story("Открытие страницы Инвестии и проверка работы калькулятора")
    public void depositTest() {
        basePage.openPage();
        depositPage.openDeposite();
        depositPage.scrollPercent();
        depositPage.checkoutPercent();
    }
}
