package registrationPage;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static core.TestStepLogger.logPreconditionStep;
import static utils.Constants.LOGIN_PAGE_URL;

public class RegistrationPageTest extends BaseTest {


    @BeforeSuite(alwaysRun = true)
    public void goToProfilePage() {

        logPreconditionStep(1, "Open 'Login' page");
        configure();
    }

    @Test
    @Description("Open login page")
    public void openLoginPage() {
        open(LOGIN_PAGE_URL);
        sleep(3000);
    }

}
