package com.ups.shippingdemo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class HomePage {
    public SelenideElement shipBtn = $("a[id='tabs_0_tab_2'] .app-title");

}
