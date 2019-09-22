package com.automician.talks.gribletest.widgets;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sergey
 */
public class Dialog {
    private SelenideElement container = $(".ui-dialog");

    public Dialog setFor(String label, String value) throws InterruptedException {

 new DialogInput(this.container,label).setValue(value);
  //finding Dialog input based on label and setting its value
         return this;
    }


    public void submit() {
        this.container.$(byId("dialog-btn-add-product")).click();

    }
}
