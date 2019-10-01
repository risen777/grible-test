package com.automician.talks.gribletest.widgets;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;

/**
 * Created by Sergey
 */
public class DialogInput {

    private final SelenideElement parent;
    private final String label;

    public  DialogInput(SelenideElement parent, String label) {

        this.parent = parent;
        this.label = label;
    }

    public void setValue(String value) {

        parent.$(withText(label)).find(byXpath("./following-sibling::*/input")).setValue(value);


    }
}
