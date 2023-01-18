package com.ups.shippingdemo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ShipmentOriginPage {
    public SelenideElement selectOriginCountry = $("select[id$='country']");
    public SelenideElement inputOriginFullName = $("input[id*='companyOrName']");
    public SelenideElement inputOriginContactName = $("input[id*='origin-cac_contactName']");
    public SelenideElement spanEditAddressAddSuite = $("button[id='origin-singleLineAddressEditButton'] span");
    public SelenideElement inputOriginAddress = $("input[id*='singleLineAddress']");
    public SelenideElement inputOriginZipCode = $("input[id$='postalCode']");
    public SelenideElement inputOriginCity = $("input[id*='city']");
    public SelenideElement inputOriginEmail = $("input[id='origin-cac_email']");
    public SelenideElement inputOriginPhone = $("input[id*='phone']");
    public SelenideElement inputOriginExtension = $("input[id='origin-cac_extension']");
    public SelenideElement buttonContinue1 = $("button[id='nbsBackForwardNavigationContinueButton']");
    public SelenideElement inputOriginAddressLine1 = $("input[id='origin-cac_addressLine1']");
    public SelenideElement inputOriginState = $("input[id='origin-cac_state']");


}
