package profilePage;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.loginPage.LoginPageSteps;
import steps.profilePage.ProfilePageSteps;
import utils.BaseTest;

import static com.codeborne.selenide.Selenide.sleep;
import static core.TestStepLogger.logPreconditionStep;
import static core.TestStepLogger.logStep;

public class ProfilePageTest extends BaseTest {

    LoginPageSteps loginPageSteps = new LoginPageSteps();
    ProfilePageSteps profilePageSteps = new ProfilePageSteps();

    @BeforeMethod(alwaysRun = true)
    public void goToLoginPage() {
        logPreconditionStep(1, "Open 'Login' page");
        configureForProfilePage();
        sleep(1000);
        logPreconditionStep(2, "Enter valid credentials");
        loginPageSteps.enterValidCred();
    }

    @Test
    @Description("Open profile page and check info about user")
    public void checkInfoAboutUser() {
        logStep(1, "Check info about user ");
        profilePageSteps.checkInfoAboutUser();
    }

    @Test
    @Description("Open profile page and update info about user")
    public void updateInfoAboutUser() {
        logStep(1, "Update user info");
        profilePageSteps.updateProfileInfo();
    }

}
