package com.uvg.taller11mayo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity5Division : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity5_division)

        btnRegresar.setOnClickListener {

            val Num1Text: EditText = ValorA
            val Num2Text: EditText = ValorB

            val Num1Num: Float = Num1Text.toString().toFloat()
            val Num2Num: Float = Num2Text.toString().toFloat()

            val Division: Float = Num1Num / Num2Num
            val ResultadoDivision: String = Division.toString()

            val intent: Intent = Intent()
            intent.putExtra("Resultado", ResultadoDivision)
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}