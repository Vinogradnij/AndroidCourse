package com.example.a62download_image_async_task

import android.view.View
import org.hamcrest.Matcher

object EspressoTestsMatchers {

    fun existDrawable(): Matcher<View> {
        return DrawableMatcher()
    }

}