package com.automician.talks.gribletest.widgets;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sergey
 */
public class Products {

    public void open() {
        Selenide.open("/");
    }


    public void add(String name) throws InterruptedException {
        $("#btn-add-product").click();

        new Dialog()
        .setFor("Name:", name)
        .setFor("Path:", name)
                .submit();
        new ConfigurationDialog().confirm();

    }
}
