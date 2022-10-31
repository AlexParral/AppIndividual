package com.example.appindividual

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainFormulario : AppCompatActivity() {
    //Creacion de variables
    lateinit var ControlErrores: TextView;
    lateinit var NombreDiligenciado: EditText;
    lateinit var ApellidoDiligenciado: EditText;
    lateinit var SexoMasculino: RadioButton;
    lateinit var SexoFemenino: RadioButton;
    lateinit var CorreoDiligenciado: EditText;
    lateinit var Continuar: Button;

    override fun onCreate (savedInsetsState: Bundle?) {
        super.onCreate(savedInsetsState)
        setContentView(R.layout.activity_formulario)

        Continuar = findViewById(R.id.button2)
        NombreDiligenciado = findViewById(R.id.editTextTextPersonName)
        ApellidoDiligenciado = findViewById(R.id.editTextTextPersonName2)
        SexoFemenino = findViewById(R.id.radioButton2)
        SexoMasculino = findViewById(R.id.radioButton)
        CorreoDiligenciado = findViewById(R.id.editTextTextEmailAddress)

        Continuar.setOnClickListener {
            if ( !controlCampos() ){
                ControlErrores.setText("")
                val ActividadRegistro = Intent(this, MainRegistro::class.java)
                ActividadRegistro.putExtra("NombreDiligenciado", NombreDiligenciado.text.toString())
                ActividadRegistro.putExtra("ApellidoDiligenciado", ApellidoDiligenciado.text.toString())
                ActividadRegistro.putExtra("CorreoDiligenciado", CorreoDiligenciado.text.toString())
                ActividadRegistro.putExtra("GeneroSeleccionado", ConveritirATexto())
            }
        }
    }

    /************************************************************
     * Metodos implementados
     ************************************************************/

    fun controlCampos(): Boolean {
        var marcacion: Boolean = false;
        // Cuando algún campo esta vacio
        if (NombreDiligenciado.text.isEmpty() || ApellidoDiligenciado.text.isEmpty() || CorreoDiligenciado.text.isEmpty()){
            marcacion = true;
        }
        return marcacion;
    }

    fun ConveritirATexto(): String {
        var SexoSeleccionado: String = "";

        if (SexoFemenino.isChecked){
            SexoSeleccionado = "Femenino";
        }else {
            SexoSeleccionado = "Masculino";
        }
        return SexoSeleccionado;
    }
}