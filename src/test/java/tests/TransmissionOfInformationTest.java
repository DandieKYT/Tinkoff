package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class TransmissionOfInformationTest extends TestBase {
    @Test
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
