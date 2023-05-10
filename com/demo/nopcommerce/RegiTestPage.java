package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Pages.LoginPage;
import com.demo.nopcommerce.Pages.Regi_Page;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegiTestPage {
    WebDriver driver;
    BasePage basePage=new BasePage();
    Properties prop = new Properties();
    Regi_Page regi_page;
@Test(priority = 1)
    public void openBrowser(){
        basePage=new BasePage();
        prop=basePage.initialiseProperties();
        String webEngin=prop.getProperty("browser");
        driver=basePage.initialiseDriver(webEngin);
        driver.get(prop.getProperty("url"));
        regi_page = new Regi_Page(driver);
    }
    @Test(priority = 2)
    public void registerTest(){
        regi_page.clickOnRegisterpage();


    }
    @Test(priority = 3)
    public void doRegistertest(){
          regi_page.doRegister(prop.getProperty("Firstname"),prop.getProperty("Lastname"), prop.getProperty("DateOfBirthDay"), prop.getProperty("DateOfBirthMonth"),prop.getProperty("DateOfBirthYear"),
                prop.getProperty("Email"), prop.getProperty("CompanyName"), prop.getProperty("Password"), prop.getProperty("ConfirmPassword") );
    }
@Test(priority = 4)

    public void closeBrowser() throws InterruptedException {

    Thread.sleep(1000);
    driver.close();
    }


}
