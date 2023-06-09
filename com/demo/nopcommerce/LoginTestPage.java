package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class LoginTestPage {
    WebDriver driver;
    BasePage basePage= new BasePage();
    Properties prop =new Properties();
    LoginPage loginPage;

    @BeforeMethod
    public void openBrowser(){
        basePage=new BasePage();
        prop=basePage.initialiseProperties();
        String webEngin=prop.getProperty("browser");
        driver=basePage.initialiseDriver(webEngin);
        driver.get(prop.getProperty("url"));
        loginPage = new LoginPage(driver);
    }
     @Test
    public void loginTest() {
        loginPage.clickOnLoginLink();
        loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password") );

     }



    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
