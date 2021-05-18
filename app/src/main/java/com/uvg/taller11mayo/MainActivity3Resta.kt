package com.uvg.taller11mayo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity3Resta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnRegresar.setOnClickListener {

            val Num1Text: EditText = ValorA
            val Num2Text: EditText = ValorB

            val Num1Num: Float = Num1Text.toString().toFloat()
            val Num2Num: Float = Num2Text.toString().toFloat()

            val Resta: Float = Num1Num - Num2Num
            val ResultadoResta: String = Resta.toString()

            val intent: Intent = Intent()
            intent.putExtra("Resultado", ResultadoResta)
            setResult(RESULT_OK, intent)
            finish()
        }

    }

}