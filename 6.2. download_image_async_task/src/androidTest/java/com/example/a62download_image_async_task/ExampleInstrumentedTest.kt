package com.example.a62download_image_async_task

import android.content.pm.ActivityInfo
import android.os.SystemClock
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.a62download_image_async_task.EspressoTestsMatchers.existDrawable

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
class ImageViewTest {
    @get:Rule
    val mainRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkImageView() {
        mainRule.activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        SystemClock.sleep(5000)
        Espresso.onView(ViewMatchers.withId(R.id.our_image))
            .check(ViewAssertions.matches(existDrawable()))
    }
}
