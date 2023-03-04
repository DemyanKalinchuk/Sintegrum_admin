package pages.home;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class HomePageSintegrum {

    public SelenideElement checkLogo = $(xpath("//header/div/div/div[1]/a/p"));
    public SelenideElement clickOnButtonAboutServices = $(xpath("//*[@href='#about']"));
    public SelenideElement clickOnButtonAdvantages = $(xpath("//*[@href='#advantage']"));
    public SelenideElement clickOnButtonPartners = $(xpath("//*[@href='#partners']"));
    public SelenideElement clickOnButtonReviews = $(xpath("//*[@href='#reviews']"));
    public SelenideElement clickOnButtonRequestTestDrive = $(xpath("//button[@class='btn btn-small btn-small--desktop popup-test-drive']"));


}
