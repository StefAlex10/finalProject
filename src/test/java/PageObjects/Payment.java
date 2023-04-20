package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
    public Payment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement nameCardHolder;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement numberCard;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement cvcCode;

    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement month;

    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement year;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextButtonPayment;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement getToSuccess;

    public void writeCardHolderName(String string) {
        this.nameCardHolder.sendKeys(string);
    }

    public void writeNumberCard(String string) {
        this.numberCard.sendKeys(string);
    }

    public void writeCVCCode(String string) {
        this.cvcCode.sendKeys(string);
    }

    public void clickMonth() { this.month.click(); }
    public void clickYear() { this.year.click(); }
    public void clickPaymentNextButton() {
        this.nextButtonPayment.click();
    }
    public String getToSuccessText() {
        return this.getToSuccess.getText();
    }
}