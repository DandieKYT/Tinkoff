package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class PrivateOfficePage {
    private SelenideElement
            privateOfficeHover = $x("//span[text()='Личный кабинет']"),
            internetBank = $x("//li/div/a/span/div"),
            bisness = $x("//li[2]/div/a/span/div"),
            deposite = $x("//li[3]/div/a/span/div"),
            mobileTinkoff = $x("//li[4]/div/a/span/div"),
            checkoutInternetBank = $x("//*[@id='form-title']"),
            checkoutBisness = $x("//*[@id='form-title']"),
            checkoutDeposite = $x("//*[@id='form-title']"),
            checkoutMobileTinkoff = $x("//*[@id='form-title']");


    public PrivateOfficePage internetBank() {
        step("Открытие интернет-банка", () -> {
            privateOfficeHover.hover();
            internetBank.click();
            Selenide.switchTo().window(1);
        });
        return this;
    }

    public PrivateOfficePage privateOfficeHover() {
        step("Наведение курсора на личный кабинет", () -> {
            privateOfficeHover.click();
        });
        return this;
    }

    public PrivateOfficePage bisness() {
        step("Открытие Тинькофф-Бизнес", () -> {
            privateOfficeHover.hover();
            bisness.click();
            Selenide.switchTo().window(1);
        });
        return this;
    }

    public PrivateOfficePage deposite() {
        step("Открытие Инвестиций", () -> {
            privateOfficeHover.hover();
            deposite.click();
            Selenide.switchTo().window(1);
        });
        return this;
    }

    public PrivateOfficePage mobileTinkoff() {
        step("Открытие Тинькофф-Мобайл", () -> {
            privateOfficeHover.hover();
            mobileTinkoff.click();
            Selenide.switchTo().window(1);
        });
        return this;
    }

    public PrivateOfficePage checkoutInternetBank() {
        step("Проверка заголовка странцы авторизации Интернет-банка", () -> {
            checkoutInternetBank.shouldBe(Condition.text("Вход в Тинькофф"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return this;
    }

    public PrivateOfficePage checkoutBisness() {
        step("Проверка заголовка странцы авторизации Тинькофф-Бизнес", () -> {
            checkoutBisness.shouldBe(Condition.text("Вход в Тинькофф Бизнес"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return this;
    }

    public PrivateOfficePage checkoutDeposite() {
        step("Проверка заголовка странцы авторизации Инвестиции", () -> {
            checkoutDeposite.shouldBe(Condition.text("Вход в Тинькофф"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return this;
    }

    public PrivateOfficePage checkoutMobileTinkoff() {
        step("Проверка заголовка странцы авторизации Мобайл-Тинькофф", () -> {
            checkoutMobileTinkoff.shouldBe(Condition.text("Вход в Мобайл"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return this;
    }
}
