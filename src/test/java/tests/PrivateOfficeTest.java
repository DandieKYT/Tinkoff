package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PrivateOfficeTest extends TestBase {

    @Test
    @Tag("PrivateOfficeTest")
    @Feature("Проверка страницы авторизации")
    @Story("Открытие страниц Интернет-Банк, Тинькофф-Бизнесс, Инвестиции, Тинькофф-Мобайл и проверка их содержимого")
    public void privateOfficeTest() {
        basePage.openPage();
        privateOfficePage.internetBank();
        privateOfficePage.checkoutInternetBank();
        privateOfficePage.bisness();
        privateOfficePage.checkoutBisness();
        privateOfficePage.deposite();
        privateOfficePage.checkoutDeposite();
        privateOfficePage.mobileTinkoff();
        privateOfficePage.checkoutMobileTinkoff();
    }
}
