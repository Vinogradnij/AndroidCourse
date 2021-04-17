package com.example.a41recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**Написать Android приложение, которое выводит все записи из bibtex файла на экран, используя
предложенную библиотеку и RecyclerView. В качестве исходных данных использовать файл, записи в
котором имеют разный формат (@article, @misc, @inproceedings, etc). Использовать разное
визуальное отображение для записей разного типа.*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
