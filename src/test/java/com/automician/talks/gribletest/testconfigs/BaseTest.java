package com.automician.talks.gribletest.testconfigs;

import com.codeborne.selenide.Configuration;

/**
 * Created by Sergey
 */
public class BaseTest {

    {
        Configuration.baseUrl = "http://localhost:8123";
    }

}
