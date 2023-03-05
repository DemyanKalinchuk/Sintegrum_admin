package homePage;

import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.homePage.HomePageSteps;
import utils.BaseTest;

import static core.TestStepLogger.logPreconditionStep;
import static core.TestStepLogger.logStep;

public class HomePageTestSintegrum extends BaseTest {

    private HomePageSteps homePageSteps = new HomePageSteps();

    @BeforeMethod(alwaysRun = true)
    public void goToProfilePage() {
        logPreconditionStep(1, "Open 'Home' page");
        configure();
    }

    @Test
    @Description("Check header menu")
    public void checkLogoAndHeader() {
        logStep(1, "Open home page and check logo");
        homePageSteps.checkLogo();

        logStep(2, "Click on link about service");
        homePageSteps.clickOnButtonAboutServices();

        logStep(3, "Click on link advantages");
        homePageSteps.clickOnButtonAdvantages();

        logStep(4, "Click on link partners");
        homePageSteps.clickOnButtonPartners();

        logStep(5, "Click on link reviews");
        homePageSteps.clickOnButtonReviews();
    }

    @Test
    @Description("Click on button 'Request а test-drive'")
    public void clickOnRequestATestDriveButton() {
        logStep(1, "Open home page and click on 'Request а test-drive' button");
        homePageSteps.clickOnButtonRequestATestDrive();
    }

}
