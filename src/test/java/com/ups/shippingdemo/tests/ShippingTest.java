package com.ups.shippingdemo.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.ups.shippingdemo.pages.HomePage;
import com.ups.shippingdemo.steps.ShipmentSteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class ShippingTest {

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x1000";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://www.ups.com/us/en/Home.page");
    }

    @Test
    public void doShipping() {
        HomePage homePage = new HomePage();
        ShipmentSteps shipmentSteps = new ShipmentSteps();

        homePage.shipBtn.click();
        shipmentSteps.doOriginForm();

    }
}
