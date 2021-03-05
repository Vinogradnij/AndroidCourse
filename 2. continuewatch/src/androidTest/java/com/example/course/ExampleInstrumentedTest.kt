package com.example.course

import android.content.pm.ActivityInfo
import android.os.SystemClock
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import androidx.test.uiautomator.UiDevice

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ContinueWatchTest {
    @get:Rule
    val mainRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun correctCount() {
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        SystemClock.sleep(2000)
        Espresso.onView(ViewMatchers.withId(R.id.textSecondsElapsed))
            .check(matches(withText("1")))
        SystemClock.sleep(1000)
        Espresso.onView(ViewMatchers.withId(R.id.textSecondsElapsed))
            .check(matches(withText("2")))
    }

    @Test
    fun correctCountOrientation() {
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        SystemClock.sleep(2000)
        Espresso.onView(ViewMatchers.withId(R.id.textSecondsElapsed))
            .check(matches(withText("1")))
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        SystemClock.sleep(2000)
        Espresso.onView(ViewMatchers.withId(R.id.textSecondsElapsed))
            .check(matches(withText("2")))
    }

    @Test
    fun correctCountBlockScreen() {
        val uiDevice = UiDevice.getInstance(getInstrumentation())
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        SystemClock.sleep(2000)
        Espresso.onView(ViewMatchers.withId(R.id.textSecondsElapsed))
            .check(matches(withText("1")))
        uiDevice.sleep()
        SystemClock.sleep(2000)
        uiDevice.wakeUp()
        Espresso.onView(ViewMatchers.withId(R.id.textSecondsElapsed))
            .check(matches(withText("1")))
    }
}

