package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.in");

        Actions actions =new Actions(driver);
        //Hover
        actions.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();

        //LeftClick
        actions.click(driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"))).build().perform();

        //RightClick
        actions.contextClick(driver.findElement(By.xpath("//a[text()='Best Sellers'][1]"))).build().perform();



    }
}
