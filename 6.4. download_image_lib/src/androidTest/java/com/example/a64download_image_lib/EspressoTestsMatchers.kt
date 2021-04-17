package com.example.a64download_image_lib

import android.view.View
import org.hamcrest.Matcher

object EspressoTestsMatchers {

    fun existDrawable(): Matcher<View> {
        return DrawableMatcher()
    }

}