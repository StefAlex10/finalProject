package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfo {
    public ContactInfo(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
        private WebElement contactEmailField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
        private WebElement phoneField;

    @FindBy(xpath = "//*[@id=\"country\"]")
        private WebElement countryField;

    @FindBy(xpath = "//*[@id=\"city\"]")
        private WebElement cityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
        private WebElement postCodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
        private WebElement nextButtonContact;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
        private WebElement courseOptions;

    public void writeContactEmail(String string) {
        this.contactEmailField.sendKeys(string);
    }

    public void writePhone (String string) {
        this.phoneField.sendKeys(string);
    }

    public void writeCountry (String string) {
        this.countryField.sendKeys(string);
    }

    public void writeCity (String string){
        this.cityField.sendKeys(string);
    }

    public void writePostCode (String string) {
        this.postCodeField.sendKeys(string);
    }

    public void clickOnNextContactButton () {
        this.nextButtonContact.click();
    }

    public String getToCourseOptions () {
        return this.courseOptions.getText();
    }

    public void fillContactInfo() {
        writeContactEmail("test@tester.com");
        writePhone("023455687");
        writeCountry("Romania");
        writeCity("Brasov");
        writePostCode("527002");
    }








}
