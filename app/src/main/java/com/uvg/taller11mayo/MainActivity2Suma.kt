package com.uvg.taller11mayo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2Suma : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        if (bundle != null) {
            val texto = bundle.getString("valor")
            txtTexto.text = texto

            val valor2 = bundle.getString("valor2")
            Toast.makeText(this, valor2, Toast.LENGTH_SHORT).show()

            /*Forma 1 de evitar que crashee
            val valor3 = bundle.getString("valor3")
            if(valor3 != null){
                Toast.makeText(this, valor3, Toast.LENGTH_SHORT).show()
            }*/

            /*Forma 2 de evitar que crashee*/
            val valor3 = bundle.getString("valor3", "No hay valor")
            Toast.makeText(this, valor3, Toast.LENGTH_SHORT).show()

        }

        btnRegresar.setOnClickListener {

            val Num1Text: EditText = ValorA
            val Num2Text: EditText = ValorB

            val Num1Num: Float = Num1Text.toString().toFloat()
            val Num2Num: Float = Num2Text.toString().toFloat()

            val Suma: Float = Num1Num + Num2Num
            val ResultadoSuma: String = Suma.toString()

            val intent: Intent = Intent()
            intent.putExtra("Resultado", ResultadoSuma)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}