package pages.loginPage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class LoginPage {


    public SelenideElement inputMail = $(xpath("//*[@id='mat-input-0']"));
    public SelenideElement inputPass = $(xpath("//*[@id='mat-input-1']"));
    public SelenideElement authButton = $(xpath("//*[@class='mat-focus-indicator mat-button_s-48 mat-button_blue w-100 mat-button mat-button-base']"));
    public  SelenideElement clickOnButtonSwitchLanguage = $(xpath("//*[@class='mat-focus-indicator mat-menu-trigger ddl-button mat-button mat-button-base']"));
    public SelenideElement switchLanguageToEnglish = $(xpath("//div/div[@id='cdk-overlay-1']/div/div/button[contains(.,'EN')]"));
    public SelenideElement errorMessage = $(xpath("//*[@class='cdk-overlay-container']/div/div/snack-bar-container/div/div/app-snack-bar/div/div[2]"));


}
