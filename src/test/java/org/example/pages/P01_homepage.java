package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_homepage {

    public WebElement firstName(){
        return Hooks.driver.findElement(By.name("first_name"));
    }

    public WebElement lastName(){
        return Hooks.driver.findElement(By.name("last_name"));
    }

    public WebElement businessName(){
        return Hooks.driver.findElement(By.name("business_name"));
    }

    public WebElement email(){
        return Hooks.driver.findElement(By.name("email"));
    }

    public WebElement firstNumber(){
        return Hooks.driver.findElement(By.id("numb1"));
    }

    public WebElement secondNumber(){
        return Hooks.driver.findElement(By.id("numb2"));
    }

    public WebElement result(){
        return Hooks.driver.findElement(By.id("number"));
    }

    public WebElement submitButton(){
        return Hooks.driver.findElement(By.id("demo"));
    }



}
