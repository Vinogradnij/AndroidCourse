package com.example.a31start_activity_for_result

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**Реализовать навигацию между экранами одного приложения с помощью Activity, Intent и метода
startActivityForResult. Activity 'About' должна быть доступна из любой другой Activity с помощью
Options Menu. Приложение начинает работу с отображения Activity 1. Кнопка 'to first' отображает на
экране Activity 1. Кнопка 'to second' отображает на экране Activity 2. Кнопка 'to third' отображает
на экране Activity 3. В любой момент в backstack любого task приложения должно быть не более 4
activity.*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
