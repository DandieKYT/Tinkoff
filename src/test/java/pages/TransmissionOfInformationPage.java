package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class TransmissionOfInformationPage {
    private SelenideElement

            businessOpen = $x("//span[text()='Бизнесу']"),
            accountingOpen = $(".abdZJZ6tq:nth-child(2) > div:nth-child(2) > .abnU9OP88:nth-child(2) .ab6mCLqrx"),
            connectButton = $x("//*[contains(@class, 'dbou--HIZq')]"),
            informationLink = $x("//span[text()='c условиями передачи информации']"),
            informationWindowTitle = $x("//h1[text()='Условия передачи информации']"),
            closeWindow = $x("//*[@aria-label='Закрыть попап']");

    public TransmissionOfInformationPage businessOpen() {
        step("Открытие предложений для бизнеса", () -> {
            businessOpen.hover();
        });
        return this;
    }
    public TransmissionOfInformationPage accountingOpen() {
        step("Открытие предложений для бизнеса", () -> {
            accountingOpen.click();
        });
        return this;
    }

    public TransmissionOfInformationPage connectButton() {
        step("Нажатие кнопки подключить", () -> {
            connectButton.click();
        });
        return this;
    }

    public TransmissionOfInformationPage informationLink() {
        step("Открытие условий передачи информации ", () -> {
            informationLink.click();
        });
        return this;
    }

    public TransmissionOfInformationPage informationWindowTitle() {
        step("Проверка заголовка документа", () -> {
            informationWindowTitle.shouldBe(Condition.text("Условия передачи информации"));
        });
        return this;
    }

    public TransmissionOfInformationPage closeWindow() {
        step("Закрытие попапа", () -> {
            closeWindow.click();
        });
        return this;
    }
}
