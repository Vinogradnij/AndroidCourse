package com.example.a42infinite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**Сделать список из предыдущей задачи бесконечным: после последнего элемента все записи
повторяются, начиная с первой.*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
