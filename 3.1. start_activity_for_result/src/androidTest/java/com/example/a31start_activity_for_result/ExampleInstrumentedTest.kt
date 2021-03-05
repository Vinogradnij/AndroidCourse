package com.example.a31start_activity_for_result

import android.content.pm.ActivityInfo
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

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
class NavigationTest {
    @get:Rule
    val mainRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun forFirstScreen() {
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext())
        Espresso.onView(ViewMatchers.withText(R.string.to_about)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBackUnconditionally()
        assertTrue(mainRule.activity.isFinishing)
    }

    @Test
    fun forSecondScreen() {
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toFirst)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.third_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext())
        Espresso.onView(ViewMatchers.withText(R.string.to_about)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBackUnconditionally()
        assertTrue(mainRule.activity.isFinishing)
    }
    @Test
    fun forThirdScreen() {
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toFirstOther)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.toSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.toSecondOther)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.toThird)).perform(ViewActions.click())
        Espresso.openActionBarOverflowOrOptionsMenu(ApplicationProvider.getApplicationContext())
        Espresso.onView(ViewMatchers.withText(R.string.to_about)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.about_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.third_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        Espresso.onView(ViewMatchers.withId(R.id.third_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.second_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.first_screen))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
        Espresso.pressBackUnconditionally()
        assertTrue(mainRule.activity.isFinishing)
    }
}