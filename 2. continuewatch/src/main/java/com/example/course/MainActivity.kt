package com.example.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**Студент написал приложение: continuewatch. Это приложение по заданию должно считать, сколько
секунд пользователь провел в этом приложении. Найдите ошибки в этом приложении и исправьте их.*/

class MainActivity : AppCompatActivity() {
    var secondsElapsed: Int = 0

    var backgroundThread = Thread {
        while (true) {
            Thread.sleep(1000)
            textSecondsElapsed.post {
                textSecondsElapsed.text = secondsElapsed++.toString()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        backgroundThread.start()
    }
}

