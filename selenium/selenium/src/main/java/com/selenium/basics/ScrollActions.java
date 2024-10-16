package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");

        Actions actions =new Actions(driver);


    }
}
