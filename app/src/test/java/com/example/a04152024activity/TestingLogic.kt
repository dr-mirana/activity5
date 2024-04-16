package com.example.a04152024activity

import org.junit.Assert
import org.junit.Test
import java.text.NumberFormat

class TestingLogic {

    @Test
    fun TestingTheCalculateLogic(){
        val amount = 10.00
        val percentage = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)

        val actualTip = calculateTip(amount = amount, tipPercent = percentage, false)
        Assert.assertEquals(expectedTip, actualTip)

    }

    @Test
    fun TestingTheCalculateLogicRoundUp(){
        val amount = 12.00
        val percentage = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(3)

        val actualTip = calculateTip(amount = amount, tipPercent = percentage, true)
        Assert.assertEquals(expectedTip, actualTip)

    }
}