package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TransmissionOfInformationTest extends TestBase {
    @Test
    @Tag("TransmissionOfInformationTest")
    @Owner("Кудярвцев")
    @Feature("Проверка условий передачи информации")
    @Story("Открытие страницы Бизнесс и проверка условий передачи информации")
    public void informationTest() {
        basePage.openPage();
        informationPage.businessOpen();
        informationPage.accountingOpen();
        informationPage.connectButton();
        informationPage.informationLink();
        informationPage.informationWindowTitle();
        informationPage.closeWindow();
    }
}
