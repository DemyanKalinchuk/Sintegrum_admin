package pages.modalPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class UpdateUserInfo {

    public SelenideElement offNotificationEmail = $(xpath("//*[@class='mat-checkbox-inner-container']"));
    public SelenideElement onNotificationEmail = $(xpath("//*[@class='mat-checkbox-inner-container']"));

}
