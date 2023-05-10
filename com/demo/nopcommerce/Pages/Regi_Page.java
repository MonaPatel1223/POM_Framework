package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Regi_Page {
    WebDriver driver;
    Utils utils;


    //By Registerlink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By registerlink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By Gender = By.xpath("//*[@id=\"gender-male\"]");
    By FirstName = By.name("FirstName");
    By LastName = By.name("LastName");
    By DateOfBirthday = By.name("DateOfBirthDay");
    By DateOfMonth = By.name("DateOfBirthMonth");
    By DateOfYear = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By CompanyName = By.id("Company");


    //By Companyname = By.cssSelector("input[id='Company']");
    By Password = By.id("Password");
    By ConfirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    By RegisterButton = By.id("register-button");

    //Constructor

    public Regi_Page(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);

    }

    //Page action

    public void clickOnRegisterpage() {
        utils.doClick(registerlink);
        //utils.doClick(Gender);


    }

    public void doRegister(String firstname, String lastname, String dateofday, String dateofmonth,
                           String dateofyear, String email, String companyname, String password,
                           String confrimpassword)

                            {

        utils.doClick(Gender);
        utils.doSendKey(FirstName,firstname);
        utils.doSendKey(LastName,lastname);
        utils.doSendKey(DateOfBirthday,dateofday);
        utils.doSendKey(DateOfMonth,dateofmonth);
        utils.doSendKey(DateOfYear,dateofyear);
        utils.doSendKey(Email,email);
        utils.doSendKey(CompanyName,companyname);
        utils.doSendKey(Password,password);
        utils.doSendKey(ConfirmPassword,confrimpassword);
        utils.doClick(RegisterButton);

    }
}




