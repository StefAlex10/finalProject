package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enrollment {

    public Enrollment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

 @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstName;

 @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;

 @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userName;

 @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement password;

 @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPassword;

 @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

 @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformation;


    public void clickNextButton(){
        this.nextButton.click();
    }

    public String getContactInformation(){
            return this.contactInformation.getText();
    }

    public void writeFirstName(String string) {
        this.firstName.sendKeys(string);
    }

    public void writeLastName(String string) {
        this.lastName.sendKeys(string);
    }

    public void writeUserName(String string) {
        this.userName.sendKeys(string);
    }

    public void writePassword(String string) {
        this.password.sendKeys(string);
    }

    public void writeConfirmationPass(String string) {
        this.confirmPassword.sendKeys(string);
    }

    public void fillPersonalInformation() {
        writeFirstName("Stef");
        writeLastName("Alexandru");
        writeUserName("StefAlex");
        writePassword("password");
        writeConfirmationPass("password");
    }




}
