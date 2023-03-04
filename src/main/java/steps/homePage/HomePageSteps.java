package steps.homePage;

import io.qameta.allure.Step;
import pages.home.HomePageSintegrum;
import pages.modalPages.TestDriveRegistrationForm;
import utils.BaseTest;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static utils.Constants.MODAL_TITLE_MESSAGE;
import static utils.Constants.TEST_DRIVE_BUTTON;

public class HomePageSteps extends BaseTest {

    private HomePageSintegrum homePageSintegrum = new HomePageSintegrum();
    private TestDriveRegistrationForm testDriveRegistrationForm = new TestDriveRegistrationForm();

    @Step
    public void checkLogo() {
        homePageSintegrum.checkLogo.shouldBe(visible, Duration.ofSeconds(5));
    }

    public void clickOnButtonAboutServices() {
        homePageSintegrum.clickOnButtonAboutServices.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clickOnButtonAdvantages() {
        homePageSintegrum.clickOnButtonAdvantages.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clickOnButtonPartners() {
        homePageSintegrum.clickOnButtonPartners.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clickOnButtonReviews() {
        homePageSintegrum.clickOnButtonReviews.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    public void clickOnButtonRequestATestDrive() {
        homePageSintegrum.clickOnButtonRequestTestDrive.shouldBe(visible).shouldHave(text(TEST_DRIVE_BUTTON)).click();
        testDriveRegistrationForm.headerTxt.shouldBe(visible).shouldHave(text(MODAL_TITLE_MESSAGE));
    }
}
