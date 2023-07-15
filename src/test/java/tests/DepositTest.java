package tests;

import org.junit.jupiter.api.Test;

public class DepositTest extends TestBase {
    @Test
    public void depositTest() {
        basePage.openPage();
        depositPage.openDeposite();
        depositPage.scrollPercent();
        depositPage.checkoutPercent();
    }
}
