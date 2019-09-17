package com.example.finanzaspersonales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.finanzaspersonales.adapter as adapter1

class inicioActivity : AppCompatActivity() {

    lateinit var lv_gastos:ListView

    lateinit var adapter: com.example.finanzaspersonales.adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)


        lv_gastos=findViewById(R.id.lv_gastos)

        lv_gastos.adapter(adapter)







    }
}
