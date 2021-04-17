package com.example.a64download_image_lib

import android.view.View
import android.widget.ImageView
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

class DrawableMatcher : TypeSafeMatcher<View>(View::class.java) {


    private val resourceName: String? = null

    override fun matchesSafely(target: View): Boolean {
        return if (target !is ImageView) {
            false
        } else target.width != 0
    }


    override fun describeTo(description: Description) {
        description.appendText("with drawable from resource id: ")
        if (resourceName != null) {
            description.appendText("[")
            description.appendText(resourceName)
            description.appendText("]")
        }
    }
}