import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.LaunchConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
//    public static final String remoteUrl = System.getProperty("remoteUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

    @BeforeAll
    public static void baseTest() {
        LaunchConfig config = ConfigFactory.create(LaunchConfig.class, System.getProperties());
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.version();
//        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://vog.vkusvill.ru/";
        Configuration.remote = config.remoteUrl();

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", System.getProperty("browser"));
//        capabilities.setCapability("browserVersion",System.getProperty("browserVersion"));
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
//        Configuration.browserCapabilities = capabilities;
        SelenideLogger.addListener("allure", new AllureSelenide());
//        open(baseUrl);
    }
    }
