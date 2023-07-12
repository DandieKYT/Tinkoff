package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PrivateOfficeTest extends TestBase {
    @Tag("productsAndCompany")
    @CsvSource(value = {
            "Интернет-банк ,      Вход в Тинькофф",
            "Тинькофф Бизнес,     Вход в Тинькофф Бизнес",
            "Инвестиции,           Вход в Тинькофф",
            "Тинькофф Мобайл,       Вход в Мобайл"
    })
    @Owner("Kudryavtsev")
    @Feature("Продукты и Компания")
    @Story("Открытие страниц Продукты и Компания и проверка их содержимого")
    @ParameterizedTest
    public void productsAndCompany(String param, String expectedText) {
        basePage.openPage();
        privateOfficePage.hoverPrivateOffice(null);
        privateOfficePage.openTitle(param);
        privateOfficePage.checkTitle(expectedText);
    }
}
