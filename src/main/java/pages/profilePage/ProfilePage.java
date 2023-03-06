package pages.profilePage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class ProfilePage {

    public SelenideElement goToProfilePage = $(xpath("//*[@href='/user/profile']"));
    public SelenideElement clickUpdateProfileButton = $(xpath("//app-profile-sidenav/div/div[1]/div[2]/button"));
    public SelenideElement checkFirstNameAndLastName = $(xpath("//*[@class='profile-name']"));

}
