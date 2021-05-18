package com.uvg.taller11mayo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity4Multiplicacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity4_multiplicacion)

        btnRegresar.setOnClickListener {

            val Num1Text: EditText = ValorA
            val Num2Text: EditText = ValorB

            val Num1Num: Float = Num1Text.toString().toFloat()
            val Num2Num: Float = Num2Text.toString().toFloat()

            val Multiplicacion: Float = Num1Num * Num2Num
            val ResultadoMul: String = Multiplicacion.toString()

            val intent: Intent = Intent()
            intent.putExtra("Resultado", ResultadoMul)
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}