package com.uvg.taller11mayo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity5Division : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity5_division)

        btnRegresar.setOnClickListener {

            val num1Text: EditText = ValorA
            val num2Text: EditText = ValorB

            if(num1Text.text.isEmpty() || num2Text.text.isEmpty()) {
                Toast.makeText(this, "Se deben de llenar todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val num1Num: Float = num1Text.text.toString().toFloat()
                val num2Num: Float = num2Text.text.toString().toFloat()

                val division: Float = num1Num / num2Num
                val resultadoDivision: String = division.toString()

                val intent: Intent = Intent(this, MainActivity::class.java)
                intent.putExtra("Resultado", resultadoDivision)
                setResult(RESULT_OK, intent)
                finish()
            }

        }

    }
}