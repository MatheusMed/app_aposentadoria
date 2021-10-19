package com.example.calcularaposentadoria

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // acessar o spinner
        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)

        spn_sexo.adapter = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,
            listOf("masculino","feminino"))

        //acessar caia de texto idade

        val txt_idade = findViewById<EditText>(R.id.txt_idade)

        // acessar botao calcular

        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

        // acessar o texto de resultado
        val txt_resultado = findViewById<TextView>(R.id.text_resultado)

        btn_calcular.setOnClickListener{
            val sexo = spn_sexo.selectedItem as String
            val idade = txt_idade.text.toString().toInt()
            var resultado = 0

            if(sexo == "masculino") {
                resultado = 65 - idade

            }else{
                resultado = 60 - idade
            }

            txt_resultado.text = "Faltam $resultado anos para você se aposentar"
        }










    }
}