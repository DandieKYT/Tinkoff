package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SocialGroupPage {
    private SelenideElement
            vkOpen = $("[title='VK'] .footer__dYqS1O > svg > path"),
            vkCheckTitle = $x("//h1[text()='Тинькофф']"),
            telegramOpen = $("[title='Telegram'] .footer__dYqS1O > svg > path"),
            telegramCheckTitle = $x("//span[text()='Тинькофф']");

    public SocialGroupPage vkOpen() {
        step("Открытие страницы c компании в ВК", () -> {
            vkOpen.click();
            switchTo().window(1);
        });
        return this;
    }

    public SocialGroupPage vkCheckTitle() {
        step("Проверка заголовка группы", () -> {
            vkCheckTitle.shouldBe(Condition.text("Тинькофф"));
            Selenide.closeWindow();
            switchTo().window(0);
        });
        return this;
    }

    public SocialGroupPage telegramOpen() {
        step("Открытие страницы в telegram", () -> {
            telegramOpen.click();
            switchTo().window(1);
        });
        return this;
    }

    public SocialGroupPage telegramCheckTitle() {
        step("Проверка заголовка группы", () -> {
            telegramCheckTitle.shouldBe(Condition.text("Тинькофф"));
            Selenide.closeWindow();
            switchTo().window(0);
        });
        return this;
    }
}
