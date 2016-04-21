import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Peeta on 4/21/2016.
 */
public class MainPage {

    private final String SITE_URL = "http://www.expedia.com";

    public String getSiteUrl() {
        return SITE_URL;
    }

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "package-origin")
    private WebElement packageOrigin;

    @FindBy(id = "package-destination")
    private WebElement packageDestination;

    public void typeOrigin(String text) {
        packageOrigin.sendKeys(text);
    }

    public void typeDestination(String text) {
        packageDestination.sendKeys(text);
    }

}
