package com.automician.talks.gribletest.widgets;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by Sergey
 */
public class Section {

    //public Section(String name) {

        //$$("/section-cell").findBy(text(name));

    //}

    public void click(String name) {
        $$(".section-cell").findBy(text(name)).click();

    }
}
