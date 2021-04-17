package com.example.a42infinite

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Matcher

class CustomMatchers {
    companion object {
        fun withItemCountInfinite(count: Int): Matcher<View> {
            return object : BoundedMatcher<View, RecyclerView>(RecyclerView::class.java) {
                override fun describeTo(description: org.hamcrest.Description?) {
                    description?.appendText("RecyclerView with item count: $count")
                }

                override fun matchesSafely(item: RecyclerView?): Boolean {
                    return item?.adapter?.itemCount!! > count
                }
            }
        }
    }
}