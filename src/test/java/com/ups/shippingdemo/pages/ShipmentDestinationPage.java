package com.ups.shippingdemo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ShipmentDestinationPage {
    public SelenideElement selectDestinationCountry = $("select[id$='destination-cac_country']");
    public SelenideElement inputDestinationFullName = $("input[id$='destination-cac_companyOrName']");
    public SelenideElement inputDestinationContactName = $("input[id$='destination-cac_contactName']");
    public SelenideElement spanEditAddressAddSuite = $("button[id='destination-singleLineAddressEditButton'] span");
}
