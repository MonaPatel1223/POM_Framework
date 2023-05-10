package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    Utils utils;

    By loginlink =By.className("ico-login");
    By emailID = By.id("Email");
    By passWord = By.id("Password");
    By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");


    // consturctor
    public LoginPage(WebDriver driver){
        this.driver=driver;
       utils =new Utils(driver);

    }
    // page action

    public void clickOnLoginLink() {
        utils.doClick(loginlink);
    }
    public void doLogin(String UserName, String Password){
        utils.doSendKey(emailID,UserName);
        utils.doSendKey(passWord,Password);
        utils.doClick(loginButton);

    }


}

