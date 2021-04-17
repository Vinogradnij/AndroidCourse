package com.example.a71starter_service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/** Разработать started service, скачивающий файл из интернета. URL изображения для скачивания
должен передаваться в Intent. Добавить в разработанный сервис функцию отправки broadcast сообщения
по завершении скачивания. Сообщение (Intent) должен содержать путь к скачанному файлу.*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
