package tests;

import org.junit.jupiter.api.Test;

public class QaVacationTest extends TestBase {
    @Test
    public void qaVacation(){
        basePage.openPage();
        qaVacationPage.workIt();
        qaVacationPage.qaDirection();
        qaVacationPage.searchQaVacation();
        qaVacationPage.qaCheck();
    }
}
