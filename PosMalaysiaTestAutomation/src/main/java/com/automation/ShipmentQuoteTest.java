package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ShipmentQuoteTest {

    public static void main(String[] args) {
        // Set path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to rate calculator page
            driver.get("https://pos.com.my/send/ratecalculator");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            //Step 2:
            // Malaysia is not selected as it was already default value
            // Enter postcode in From field
            WebElement fromPostcode = driver.findElement(By.xpath("//input[@placeholder='Postcode']"));
            fromPostcode.sendKeys("35600");

            // Step 3: Select "India" as To country
            WebElement toCountryDropdown = driver.findElement(By.xpath("//mat-option[@id='mat-option-296']"));
            toCountryDropdown.click();

            // Step 4: Enter weight
            WebElement weightInput = driver.findElement(By.xpath("//input[@placeholder='eg. 0.1kg']"));
            weightInput.sendKeys("1");

            // Click Calculate button
            WebElement calculateBtn = driver.findElement(By.xpath("//button[contains(text(),'Calculate')]"));
            calculateBtn.click();

            // Wait for result
            Thread.sleep(5000);

            // Step 5: Verify presence of Book Now button
            boolean isBookNowVisible = driver.findElements(By.xpath("(//a[normalize-space()='Book Now'])[1]")).size() > 0;

            if (isBookNowVisible) {
                System.out.println("Test Case Passed: Book Now button is visible.");
            } else {
                System.out.println("Test Case Failed: Book Now button not found.");
            }

        } catch (Exception e) {
            System.out.println("Test Failed - Exception: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}