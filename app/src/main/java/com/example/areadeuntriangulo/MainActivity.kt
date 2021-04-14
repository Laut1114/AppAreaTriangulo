package com.example.areadeuntriangulo

import android.annotation.SuppressLint
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton.setOnClickListener {
            calculo()
        }

        botonVolver.setOnClickListener {
            volver()
        }
    }

    @SuppressLint("SetTextI18n")
    fun calculo() {
        val valor1: EditText = findViewById(R.id.altura)
        val valor2: EditText = findViewById(R.id.base)

        val altura = valor1.text.toString().toInt()
        val base= valor2.text.toString().toInt()

        val calculo = (altura * base) / 2

        tituloResultado.visibility = View.VISIBLE
        cardResultado.visibility = View.VISIBLE
        resultadoFinal.text = "$calculo M2"

        boton.visibility = View.INVISIBLE
        botonVolver.visibility = View.VISIBLE
    }

    fun volver() {

        altura.text.clear()
        base.text.clear()

        tituloResultado.visibility = View.GONE
        cardResultado.visibility = View.GONE
        boton.visibility = View.VISIBLE
        botonVolver.visibility = View.GONE
    }
}

