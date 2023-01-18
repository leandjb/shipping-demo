package com.ups.shippingdemo.steps;

import com.github.javafaker.Faker;
import com.ups.shippingdemo.pages.ShipmentOriginPage;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.sleep;

public class ShipmentSteps {

    public void doOriginForm(){
        Faker faker = Faker.instance(new Locale("es", "CO"));
        ShipmentOriginPage shipmentOriginPage = new ShipmentOriginPage();
        sleep(2000);


        shipmentOriginPage.selectOriginCountry.selectOptionByValue(String.valueOf(51));
        shipmentOriginPage.inputOriginFullName.setValue(faker.name().fullName());
        shipmentOriginPage.inputOriginContactName.setValue(faker.name().firstName());
        shipmentOriginPage.inputOriginEmail.setValue(faker.internet().emailAddress());
        shipmentOriginPage.inputOriginPhone.setValue(faker.phoneNumber().subscriberNumber(7));
        shipmentOriginPage.inputOriginExtension.setValue(faker.phoneNumber().extension());
        shipmentOriginPage.spanEditAddressAddSuite.click();

        if(shipmentOriginPage.inputOriginZipCode.isDisplayed()){
            shipmentOriginPage.inputOriginAddressLine1.setValue(faker.address().streetAddressNumber());
            shipmentOriginPage.inputOriginCity.setValue(faker.address().cityName());
            shipmentOriginPage.inputOriginState.setValue(faker.address().state());
            shipmentOriginPage.inputOriginZipCode.setValue(faker.phoneNumber().subscriberNumber(7));
        }

        shipmentOriginPage.buttonContinue1.scrollTo();
        shipmentOriginPage.buttonContinue1.click();
        sleep(10000);


    }
}
