package com.example.finanzaspersonales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn_gastos:Button
    lateinit var btn_ingresos:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        escuchar()
        botongastos()
        botoningresos()
    }
     fun escuchar(){
         btn_gastos=findViewById(R.id.btn_gastos)
         btn_ingresos=findViewById(R.id.btn_ingresos)

     }

    private fun botongastos(){
        btn_gastos.setOnClickListener(){

            val intent=Intent(this,inicioActivity::class.java)
            startActivity(intent)
        }

    }
    private fun botoningresos(){

        btn_ingresos.setOnClickListener(){

            val intent=Intent(this,Activity_Ingresos::class.java)
            startActivity(intent)

        }
    }
}
