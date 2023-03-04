package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static utils.Constants.BASE_URL;

public abstract class BaseTest extends Base {


    public void configure() {
        SelenideLogger.addListener(testProperties.selenideListener(), new AllureSelenide().screenshots(true).savePageSource(false));
        WebDriverManager.chromedriver().driverVersion(testProperties.chromeDriverVersion()).setup();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--enable-features=NetworkService,NetworkServiceInProcess");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        Configuration.browserCapabilities = capabilities;
        Configuration.browserSize = testProperties.browserSize();
        open(BASE_URL);
        refresh();
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver(){
        clearBrowserCache();
        clearBrowserLocalStorage();
        clearBrowserCookies();
        closeWebDriver();
    }

}
