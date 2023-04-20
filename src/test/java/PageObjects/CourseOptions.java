package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptions {
    public CourseOptions(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement bulletOption;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement nextButtonCourseOption;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformationText;


    public void clickOnBulletOptions() {
        this.bulletOption.click();
    }

    public void clickOnNextButtonCourseOption() {
        this.nextButtonCourseOption.click();
    }

    public String getToPaymentInformationText() {
        return this.paymentInformationText.getText();
    }
}