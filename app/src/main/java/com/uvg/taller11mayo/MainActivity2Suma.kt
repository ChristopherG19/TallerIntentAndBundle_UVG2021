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

        /*val bundle = intent.extras

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

        }*/
        btnRegresar.setOnClickListener {
            val num1Text: EditText = ValorA
            val num2Text: EditText = ValorB
            if(num1Text.text.isEmpty() || num2Text.text.isEmpty()) {
                Toast.makeText(this, "Se deben de llenar todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val num1Num: Float = num1Text.text.toString().toFloat()
                val num2Num: Float = num2Text.text.toString().toFloat()
                val suma: Float = num1Num + num2Num
                val resultadoSuma: String = suma.toString()
                val intent: Intent = Intent(this, MainActivity::class.java)
                intent.putExtra("Resultado", resultadoSuma)
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}