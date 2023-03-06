package loginPage;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.loginPage.LoginPageSteps;
import utils.BaseTest;

import static com.codeborne.selenide.Selenide.sleep;
import static core.TestStepLogger.logPreconditionStep;
import static core.TestStepLogger.logStep;

public class LoginPageTest extends BaseTest {

    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @BeforeMethod(alwaysRun = true)
    public void goToLoginPage() {
        logPreconditionStep(1, "Open 'Login' page");
        configureForProfilePage();
        sleep(1000);
    }

    @Test(enabled = false)
    @Description("Open login page and switch language to English")
    public void switchLanguageToEnglish() {
    loginPageSteps.switchLanguageToEnglish();

    }

    @Test
    @Description("Open login page and input valid cred")
    public void loginWithValidCred() {
        logStep(1, "Enter valid credential ");
        loginPageSteps.enterValidCred();
    }

    @Test
    @Description("Open login page and input invalid cred")
    public void loginWithInvalidCred() {
        logStep(1, "Enter invalid credential ");
        loginPageSteps.enterInvalidCred();
    }

}
