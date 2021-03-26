package com.example.areadeuntriangulo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculo(view: View) {
        val valor1: EditText = findViewById(R.id.altura)
        val valor2: EditText = findViewById(R.id.base)

        var altura = valor1.text.toString().toInt()
        var base= valor2.text.toString().toInt()

        var calculo = (altura * base) / 2

        Toast.makeText(this, "El area del triangulo es: $calculo", Toast.LENGTH_LONG).show()
    }
}

