package steps.profilePage;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pages.modalPages.UpdateUserInfo;
import pages.profilePage.ProfilePage;
import utils.BaseStep;

import java.time.Duration;

import static utils.Constants.*;

public class ProfilePageSteps extends BaseStep {

    ProfilePage profilePage = new ProfilePage();
    UpdateUserInfo updateUserInfo = new UpdateUserInfo();

    @Step
    public void checkInfoAboutUser(){
        profilePage.goToProfilePage.click();
        chkTxt(profilePage.checkFirstNameAndLastName.shouldBe(Condition.visible, Duration.ofSeconds(10)), PROFILE_NAME);
    }

    @Step
    public void updateProfileInfo(){
        profilePage.goToProfilePage.click();
        profilePage.clickUpdateProfileButton.click();
        updateUserInfo.offNotificationEmail.click();
        updateUserInfo.onNotificationEmail.click();
    }
}
