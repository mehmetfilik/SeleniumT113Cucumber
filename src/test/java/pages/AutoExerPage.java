package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExerPage {

    public AutoExerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signUpLinki;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement signUpNameKutusu;

    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement signUpEmailKutusu;

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public WebElement signUpButonu;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement mrButonu;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButonu;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement accountCreatedYazisi;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmailKutusu;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPasswordKutusu;

}
