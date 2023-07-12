package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class PrivateOfficePage {

    PrivateOfficePageLocator locators = new PrivateOfficePageLocator();

    public PrivateOfficePage openTitle(String param) {
        step("Открытие вкладки", () -> {
            locators.openTitle(param).click();
        });
        return null;
    }
    public PrivateOfficePage hoverPrivateOffice(String param) {
        step("Наведение курсора на личный кабинет", () -> {
            locators.hoverPrivateOffice.hover();
        });
        return null;
    }
    public PrivateOfficePage checkTitle(String expectedText) {
        step("Проверка содержимого вкладки", () -> {
            locators.checkTitle(expectedText).shouldBe(text(expectedText));
        });
        return null;
    }


    public class PrivateOfficePageLocator {

        public SelenideElement hoverPrivateOffice = $x("//span[text()='Личный кабинет']");

        public SelenideElement openTitle(String param) {
            return $x(String.format("//span[text()='%s']", (param)));
        }

        public SelenideElement checkTitle(String expectedText) {
            return $((byTagAndText("h1", (expectedText))));
        }

    }
}
