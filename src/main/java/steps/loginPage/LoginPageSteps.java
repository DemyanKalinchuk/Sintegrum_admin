package steps.loginPage;

import io.qameta.allure.Step;
import pages.loginPage.LoginPage;
import utils.BaseTest;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static utils.Constants.AUTH_BUTTON;

public class LoginPageSteps extends BaseTest {

    LoginPage loginPage = new LoginPage();


    @Step
    public void inputValidCred(){
        loginPage.inputMail.shouldBe(visible, Duration.ofSeconds(10)).sendKeys("demonation20@gmail.com");
        loginPage.inputPass.shouldBe(visible, Duration.ofSeconds(10)).sendKeys("QWASZXedcvfr12345_");
        loginPage.authButton.shouldHave(text(AUTH_BUTTON)).click();
    }

}
