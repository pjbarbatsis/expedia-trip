import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Peeta on 4/21/2016.
 */
public class BasePageObject {
    public BasePageObject(WebDriver driver){

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
