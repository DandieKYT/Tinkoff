package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static io.qameta.allure.Allure.step;

public class QaVacationPage {
    private SelenideElement
            workIt = $x("//span[text()='Работа в IT']"),
            qaDirection = $x("//*[contains(@class, 'application')]/div/div[5]/div/div/div[3]/div/div/div/a/span/div"),
            searchQaVacation = $x("//span[text()='Смотреть вакансии']"),
            qaCheck = $x("//h3[text()='Тестирование']");


    public QaVacationPage workIt() {
        step("Открытие страницы c вакансиями компании", () -> {
            workIt.click();
        });
        return this;
    }
    public QaVacationPage qaDirection() {
        step("Открытие страницы c направлением работы QA", () -> {
            qaDirection.click();
        });
        return this;
    }
    public QaVacationPage searchQaVacation() {
        step("Открытие страницы c актульными вакансиями QA", () -> {
            searchQaVacation.click();
            switchTo().window(1);
        });
        return this;
    }
    public QaVacationPage qaCheck() {
        step("Открытие страницы c актульными вакансиями QA", () -> {
            qaCheck.shouldBe(Condition.visible);
            Selenide.closeWindow();
            switchTo().window(0);
        });
        return this;
    }
}
