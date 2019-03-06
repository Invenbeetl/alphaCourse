package pages;

import org.openqa.selenium.WebDriver;

public class Navigation {

    private WebDriver driver;
    private MainPage mainPage;
    private MenPage menPage;
    private MenNewArrivalsPage menNewArrivalsPage;

    public Navigation(WebDriver driver) {
        this.driver = driver;

    }

    public MainPage toMainPage() {
        MainPage mainPage = new MainPage(driver);
        return mainPage.openPage();
    }

    public MenPage toMenPage() {
        return new MenPage(driver).openPage();
    }

    public MenNewArrivalsPage toMenNewArrvalsPage() {
        return new MenNewArrivalsPage(driver).openPage();
    }
}
