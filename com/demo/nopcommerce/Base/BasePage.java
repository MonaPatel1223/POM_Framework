package com.demo.nopcommerce.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    //1) declare a variable
    WebDriver driver;
    Properties prop;

    FileInputStream file;
    // 2 create a method

    public WebDriver initialiseDriver(String browserName) {
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browserName.equals("safari")) {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();

        } else {
            System.out.println("Browser not match");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        return driver;

    }
    // create another method for properties

    public Properties initialiseProperties(){
        prop=new Properties();

        try {
            file = new FileInputStream("/Users/monapatel/IdeaProjects/POM_Framework/src/test/resources/TestData/config.properties");
            prop.load(file);
        }catch (FileNotFoundException e){
            System.out.println("Config file is not found, please check.....");
        }catch (IOException e){
            System.out.println("Properties could not be loaded");
        }
        return prop;

    }


}
