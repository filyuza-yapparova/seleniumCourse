package pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(),'My wallet')]");

    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        //System.out.println(driver);
        WebElement element = driver.findElement(buttonWallet);
        //System.out.println(element);
        element.click();
        return this;
    }

}
