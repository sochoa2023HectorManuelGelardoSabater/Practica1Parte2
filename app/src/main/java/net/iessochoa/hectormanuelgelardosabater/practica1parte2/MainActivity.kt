package net.iessochoa.hectormanuelgelardosabater.practica1parte2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var etNumero: EditText
    private lateinit var btComprobar: Button

    fun enviarResultado() {
//comprobamos si el campo está vacío
        if (!etNumero.text.isEmpty()) {
//Creamos el Intent hacia resultadoActivity
            val intent = Intent(this, resultadoActivity::class.java)
//le pasamos el contenido como clave:valor(parecido a un map)
            intent.putExtra(resultadoActivity.EXTRA_NUMERO, etNumero.text.toString())
//iniciamos la activity resultadoActivity
            startActivity(intent)
        } else
//enviamos un mensaje por pantalla
            Toast.makeText(this, getString(R.string.msj_numero), Toast.LENGTH_LONG).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumero = findViewById(R.id.etNumero)
        btComprobar = findViewById(R.id.btComprobar)
        //asignamos acción como lambda
        btComprobar.setOnClickListener{enviarResultado()}
    }
}