package com.automician.talks.gribletest;

import com.automician.talks.gribletest.testconfigs.BaseTest;
import com.automician.talks.gribletest.widgets.Products;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Sergey
 */
public class GribleUsageTest extends BaseTest {


    @Test
    public void createTestTableBasedOnDataStorageNewProduct() throws InterruptedException {
        Products products= new Products();
        products.open();
        products.add("Product");


    }




}
