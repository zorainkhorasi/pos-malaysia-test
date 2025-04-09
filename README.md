# POS MALAYSIA TEST

This is a simple Selenium Java automation project to verify shipment quote calculation on [Pos Malaysia Rate Calculator](https://pos.com.my/send/ratecalculator).

# Test Case

**Verify user can calculate the shipment quote from Malaysia to India.**

Steps automated:
1. Navigate to the rate calculator page.
2. Enter `35600` as the "From" postcode.
3. Select `India` as the "To" country.
4. Enter `1 kg` as the weight.
5. Click on `Calculate`.
6. Verify that the `Book Now` button is visible as confirmation.

---
# How to Run

1. Requirements

- Java JDK 11+
- Maven
- Chrome Browser
- [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/) (Ensure it's compatible with your browser version)

2. Setup

1. Extract the ZIP file.
2. Open the folder in your favorite IDE (IntelliJ IDEA or Eclipse recommended).
3. Make sure `chromedriver` is available in your system PATH or placed in the project root.
4. Run the `ShipmentQuoteTest.java` file.

3. Maven Dependencies

The required dependency for Selenium is already defined in the `pom.xml` file:
```
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
</dependency>
```

---

# Notes

- You may update the XPath values if the website structure changes.
- Screenshots or additional validations can be added for extended reporting.
