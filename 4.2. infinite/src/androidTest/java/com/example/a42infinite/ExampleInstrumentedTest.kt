package com.example.a42infinite

import android.content.pm.ActivityInfo
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.a42infinite.CustomMatchers.Companion.withItemCountInfinite

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class RecyclerViewTest {
    private val itemsCount = 288
    @get:Rule
    val mainRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun countItems() {
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        Espresso.onView(ViewMatchers.withId(R.id.recycler_view))
            .check(ViewAssertions.matches(withItemCountInfinite(itemsCount)))
    }
}
