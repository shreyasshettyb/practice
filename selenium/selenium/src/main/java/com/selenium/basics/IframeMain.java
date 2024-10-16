package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeMain {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_test");

        //Access Iframe
        WebElement frame = webDriver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        webDriver.switchTo().frame(frame);

        //Click Button
        webDriver.findElement(By.xpath("//button[text()='Click Me!']")).click();

        //Click Alert Ok
        webDriver.switchTo().alert().accept();

        //Access Default Window Button
        webDriver.switchTo().defaultContent();
        webDriver.findElement(By.xpath("//a[@title='Change Theme']")).click();

    }

}
