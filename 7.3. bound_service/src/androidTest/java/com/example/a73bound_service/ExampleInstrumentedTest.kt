package com.example.a73bound_service

import android.content.pm.ActivityInfo
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import androidx.test.uiautomator.UiDevice
import org.hamcrest.CoreMatchers

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val mainRule = ActivityTestRule(MainActivity::class.java)
    private lateinit var device: UiDevice


    @Test
    fun serviceTest() {
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        Espresso.onView(ViewMatchers.withId(R.id.text))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")))
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.text))
            .check(ViewAssertions.matches(ViewMatchers.withText(CoreMatchers.containsString("/data/"))))
    }
}
