package steps.loginPage;

import io.qameta.allure.Step;
import pages.loginPage.LoginPage;
import utils.BaseStep;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static utils.Constants.AUTH_BUTTON;
import static utils.Constants.ERROR_MESSAGE;

public class LoginPageSteps extends BaseStep {

    LoginPage loginPage = new LoginPage();


    @Step
    public void switchLanguageToEnglish(){
    loginPage.clickOnButtonSwitchLanguage.shouldBe(visible, Duration.ofSeconds(10)).click();
    loginPage.switchLanguageToEnglish.click();
    }

    @Step
    public void enterValidCred(){
        loginPage.inputMail.shouldBe(visible, Duration.ofSeconds(10)).sendKeys("demonation20@gmail.com");
        loginPage.inputPass.shouldBe(visible, Duration.ofSeconds(10)).sendKeys("QWASZXedcvfr12345_");
        loginPage.authButton.shouldHave(text(AUTH_BUTTON)).click();
    }

    @Step
    public void enterInvalidCred(){
        loginPage.inputMail.shouldBe(visible, Duration.ofSeconds(10)).sendKeys("incorrectlogintest@gmail.com");
        loginPage.inputPass.shouldBe(visible, Duration.ofSeconds(10)).sendKeys("316497");
        loginPage.authButton.shouldHave(text(AUTH_BUTTON)).click();
        chkTxt(loginPage.errorMessage, ERROR_MESSAGE);
    }

}
