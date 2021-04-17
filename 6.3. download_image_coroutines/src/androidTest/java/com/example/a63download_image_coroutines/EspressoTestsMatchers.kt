package com.example.a63download_image_coroutines

import android.view.View
import org.hamcrest.Matcher

object EspressoTestsMatchers {

    fun existDrawable(): Matcher<View> {
        return DrawableMatcher()
    }

}