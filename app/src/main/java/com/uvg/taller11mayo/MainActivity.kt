package com.uvg.taller11mayo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Se realizan las transiciones a las ventanas correspondientes*/

        btnOpeS.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2Suma::class.java)
            startActivityForResult(intent, 1)
            /*
            Realizado en clase:

            intent.putExtra("valor", "Hola mundo")
            intent.putExtra("valor2", "Prueba")
            intent.putExtra("valor3", "Si hay valor")
            startActivity(intent)
            finish()
            */
        }

        btnOpeR.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity3Resta::class.java)
            startActivityForResult(intent, 1)
        }

        btnOpeM.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity4Multiplicacion::class.java)
            startActivityForResult(intent, 1)
        }

        btnOpeD.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity5Division::class.java)
            startActivityForResult(intent, 1)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {
                val bundle = data?.extras
                if (bundle != null) {
                    val resultado = bundle.getString("Resultado")
                    TextResultado.text = resultado
                }
            }
        }
    }
}