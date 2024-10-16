package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTest {

    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.className("Pke_EE")).sendKeys("Laptops");
        driver.findElement(By.className("Pke_EE")).submit();
        List<WebElement> elementList = driver.findElements(By.className("_75nlfW"));
        for (WebElement webElement : elementList) {
            if (webElement.findElement(By.className("KzDlHZ")).getText().equals("ASUS Vivobook 15, with Backlit Keyboard, Intel Core i3 12th Gen - (8 GB/512 GB SSD/Windows 11 Home) X1...")) {
                webElement.findElement(By.className("KzDlHZ")).click();
                System.out.println("success");
//                driver.quit();
                return;
            }
        }
        System.out.println("Failed");
        driver.quit();
    }
}
