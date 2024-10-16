package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicMain {
    public static void main(String[] args) throws InterruptedException {
        //Initialization of chrome webDriver
        WebDriver webDriver = new ChromeDriver();

        //Open IRCTC WebSite
        webDriver.get("https://www.irctc.co.in/nget/train-search");

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //Testing Form Elements
//        Thread.sleep(100);
        //From - TextBox
        webDriver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("UDUPI");
//        Thread.sleep(100);
        webDriver.findElement(By.xpath("//*[@id=\"pr_id_1_list\"]/li[2]")).click();
//        webDriver.findElement(By.xpath("//span[contains(text(),'UDUPI-UD')]\"")).click();

//        Thread.sleep(100);

        //To - TextBox
        webDriver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).click();
        webDriver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("bangalore");
//        Thread.sleep(10);
        webDriver.findElement(By.xpath("//*[@id=\"pr_id_2_list\"]/li[1]/span")).click();
//        Thread.sleep(100);
        //Date in DD/MM/YYYY format - Date
        webDriver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
        webDriver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[4]/td[2]/a")).click();
        //webDriver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).sendKeys("22/10/2024");
//        Thread.sleep(100);
        //Class Type - Static Dropdown
//        Thread.sleep(100);
        webDriver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div")).click();
        webDriver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div/div[4]/div/ul/p-dropdownitem[8]/li/span")).click();
        //Seat Type - Static Dropdown
//        Thread.sleep(100);
        webDriver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div")).click();
        webDriver.findElement(By.xpath("//*[@id=\"journeyQuota\"]/div/div[4]/div/ul/p-dropdownitem[3]/li/span")).click();
        webDriver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/p-confirmdialog/div/div/div[3]/button")).click(); // popup agree

        //Option Select
        webDriver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[4]/div/span[2]/label")).click();

//        webDriver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button")).click();
        webDriver.findElement(By.xpath("//button[text()='Search']")).click();



    }
}
