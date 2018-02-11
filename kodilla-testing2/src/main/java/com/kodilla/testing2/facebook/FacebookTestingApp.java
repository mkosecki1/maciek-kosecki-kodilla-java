package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static final String XPATH_DD_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    private static final String XPATH_MM_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    private static final String XPATH_YY_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    private static final String XPATH_NAME = "//input[@id=\"u_0_n\"]";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement selectDD = driver.findElement(By.xpath(XPATH_DD_SELECT));
        Select select = new Select(selectDD);
        select.selectByIndex(18);

        WebElement selectMM = driver.findElement(By.xpath(XPATH_MM_SELECT));
        Select select2 = new Select(selectMM);
        select2.selectByIndex(8);

        WebElement selectYY = driver.findElement(By.xpath(XPATH_YY_SELECT));
        Select select3 = new Select(selectYY);
        select3.selectByIndex(37);

        WebElement selectName = driver.findElement(By.xpath(XPATH_NAME));
        selectName.sendKeys("Maciek");
    }
}
