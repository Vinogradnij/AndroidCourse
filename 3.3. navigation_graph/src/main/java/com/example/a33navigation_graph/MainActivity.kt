package com.example.a33navigation_graph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**Реализовать навигацию между экранами одного приложения с использованием navigation graph. Все
Activity должны быть заменены на фрагменты, кроме Activity 'About', которая должна остаться
самостоятельной Activity. Activity 'About' должна быть доступна с помощью Options Menu.*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
