package com.example.a51uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**Написать Espresso тесты, проверяющие:
▪ при нажатии на кнопку текст на кнопке меняется с before click на after click
▪ при повороте надпись на кнопке сбрасывается в исходное состояние
▪ при повороте экрана содержимое текстового поля сохраняется*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            button.text = getString(R.string.after_click)
        }
    }
}
