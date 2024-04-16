package com.example.a04152024activity

import androidx.compose.ui.test.junit4.createComposeRule
import com.example.a04152024activity.ui.theme._04152024ActivityTheme
import org.junit.Rule
import org.junit.Test

class TestingTheUI {
    @get:Rule
    val composeTestRule = createComposeRule()
    @Test
    fun testingTheUI() {
        composeTestRule.setContent {
            _04152024ActivityTheme {
                TipTimeLayout()
            }
        }
    }
}