package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class DepositPage {
    private SelenideElement
            openDeposite = $x("//span[text()='Открыть вклад']"),
            scrollPercent = $x("//*[contains(@class, 'dbeqniI0v')]"),
            checkoutPercent = $x("//span[text()='7%']");

    public DepositPage openDeposite() {
        step("Открытие страницы вкладов", () -> {
            openDeposite.click();
        });
        return this;
    }
    public DepositPage scrollPercent() {
        step("Установка вклада на 24 месяца", () -> {
            scrollPercent.click();
        });
        return this;
    }
    public DepositPage checkoutPercent() {
        step("Открытие страницы вкладов", () -> {
            checkoutPercent.shouldBe(Condition.text("7%"));
        });
        return this;
    }
}
