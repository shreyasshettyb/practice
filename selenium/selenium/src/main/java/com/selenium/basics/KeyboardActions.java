package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions actions =new Actions(driver);

        //Keyboard Type
        actions.click(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).sendKeys(Keys.chord("shoes")).sendKeys(Keys.RETURN).build().perform();

        actions.scrollToElement(driver.findElement(By.xpath("//span[text()='Red Tape'][1]"))).build().perform();

    }
}
