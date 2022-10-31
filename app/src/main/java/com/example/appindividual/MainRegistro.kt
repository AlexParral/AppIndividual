package com.example.appindividual

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.AbsSavedState
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainRegistro : AppCompatActivity() {
    //Creación de variables

    lateinit var NombreDiligenciado: EditText;
    lateinit var ApellidoDiligenciado: EditText;
    lateinit var Genero: RadioButton;
    lateinit var CorreoDiligenciado: EditText;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        NombreDiligenciado = findViewById(R.id.textView13)
        ApellidoDiligenciado = findViewById(R.id.textView8)
        Genero = findViewById(R.id.textView14)
        CorreoDiligenciado = findViewById(R.id.textView15)
    }

    //Metodo para llenar los campos

    fun llenarCampos() {
        val bundle = intent.extras
        NombreDiligenciado.setText(bundle?.getString("NombreDiligenciado"))
        ApellidoDiligenciado.setText(bundle?.getString("ApellidoDiligenciado"))
        Genero.setText(bundle?.getString("Genero"))
        CorreoDiligenciado.setText(bundle?.getString("CorreoDiligenciado"))
    }

}