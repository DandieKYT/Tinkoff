package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class QaVacationTest extends TestBase {
    @Test
    @Tag("QaVacationTest")
    @Owner("Кудрявцев")
    @Feature("Проверка наличия вакансии Тестировщик")
    @Story("Открытие страницы вакансий для QA и проверка их")
    public void qaVacation() {
        basePage.openPage();
        qaVacationPage.workIt();
        qaVacationPage.qaDirection();
        qaVacationPage.searchQaVacation();
        qaVacationPage.qaCheck();
    }
}
