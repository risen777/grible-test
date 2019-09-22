package com.automician.talks.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sergey
 */
public class ConfigurationDialog {
    private SelenideElement container = $(".noty_type_confirm");

    public void confirm() {
        this.container.$(".btn-primary").click();
    }

        public void decline() {
        this.container.$(".btn-danger").click();
    }

}
