package loginPage;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.loginPage.LoginPageSteps;
import utils.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static core.TestStepLogger.logPreconditionStep;
import static utils.Constants.LOGIN_PAGE_URL;

public class LoginPageTest extends BaseTest {

    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @BeforeMethod(alwaysRun = true)
    public void goToLoginPage() {
        logPreconditionStep(1, "Open 'Login' page");
        open(LOGIN_PAGE_URL);
        sleep(3000);
    }

    @Test
    @Description("Open login page and input valid cred")
    public void loginWithValidCred() {

        loginPageSteps.inputValidCred();

    }

}
