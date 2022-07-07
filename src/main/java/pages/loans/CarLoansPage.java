package pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CarLoansPage extends BasePage {

    public CarLoansPage(WebDriver driver) {
        super(driver);
    }

    private final By tabAgreement = By.xpath("//div[contains(text(),'Agreements')]");

    public CarLoansPage selectAgreementsTab() {
        driver.findElement(tabAgreement).click();
        return this;
    }
}
