package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework3005 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\ITBootcamp\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.navigate().to("http://www.strela.co.rs/");
        WebElement shop= driver.findElement(By.xpath("//*[@id=\"ctl00_RadMenu1\"]/ul/li[2]/a"));
        shop.click();
        WebElement bows= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_GrupeRadTreeView\"]/ul/li[1]/div/span[3]"));
        bows.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement samickSage= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_ListView1_ctrl35_Panel1\"]/figure/a/img"));
        samickSage.click();

        //WebElement title = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_ItemListView_ctrl0_ItemNazivLabel\"]"));
        WebElement title = driver.findElement(By.id("ctl00_MainContent_ItemListView_ctrl0_ItemNazivLabel"));
        String samickSageTitle = title.getText();

        System.out.println(samickSageTitle);

        if (samickSageTitle.contains("Samick")) {
            System.out.println("Validan test.");
        } else {
            System.out.println("Nevalidan test.");
        }
        driver.close();

    }
}

