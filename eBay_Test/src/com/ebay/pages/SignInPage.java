package com.ebay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ebay.core.Driver;

public class SignInPage extends Driver{

    PageObjects SignInPage;

    String userName = "";
    String passWord = "";

	private WebDriver driver;

    public SignInPage() {
        super();
        SignInPage = new PageObjects();
        PageFactory.initElements(driver, SignInPage);
    }

    public boolean validateSignInpage(){
        boolean elements = false;
        if(SignInPage.userNameFld.isDisplayed()){
            if(SignInPage.passwordField.isDisplayed()){
                   if(SignInPage.SignInBtn.isDisplayed()){
                        elements = true;
                    
                }
            }
        }
        else{
            elements = false;
        }
        return elements;


    }

    public boolean testSignInWithoutCredentials() {
        boolean SignInStatus = false;
        SignInPage.SignInBtn.click();
        if (SignInPage.inputError.getText().equalsIgnoreCase("Username is mandatory")) {
            SignInStatus = true;
        }
        SignInPage.userNameFld.sendKeys(userName);
        SignInPage.SignInBtn.click();
        if (SignInPage.inputError.getText().equalsIgnoreCase("Password is mandatory")) {
            SignInStatus = true;
        }
        return SignInStatus;

    }



    class PageObjects {

        @CacheLookup
        @FindBy(id = " ")
        public WebElement userNameFld;

        @CacheLookup
        @FindBy(id = " ")
        public WebElement passwordField;

        @CacheLookup
        @FindBy(id = " ")
        public WebElement SignInBtn;

        @CacheLookup
        @FindBy(name = " .")
        public WebElement inputError;

      
    }
}