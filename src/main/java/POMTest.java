import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Peeta on 4/21/2016.
 */
public class POMTest {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void checkOrigin() {
        //Instantiate main page
        MainPage mainPage = new MainPage(driver);
        System.out.println(mainPage.getSiteUrl());
        //Issue here: driver will open, but will absolutely NOT open up the URL.
        driver.get(mainPage.getSiteUrl());
        mainPage.typeOrigin("Minneapolis");
        mainPage.typeDestination("Honolulu");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

    }

}
