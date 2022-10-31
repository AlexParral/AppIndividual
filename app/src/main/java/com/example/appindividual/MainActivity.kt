package com.example.appindividual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaración de variable
        lateinit var NextActivity: Button;
        // Inicialización de variable
        NextActivity = findViewById(R.id.button)
        //Método para avanzar a la siguiente actividad al dar clic en el botón Registrarme
        NextActivity.setOnClickListener {
            val ActividadFormulario = Intent(this,MainFormulario::class.java)
            startActivity(ActividadFormulario);
        }

    }
}