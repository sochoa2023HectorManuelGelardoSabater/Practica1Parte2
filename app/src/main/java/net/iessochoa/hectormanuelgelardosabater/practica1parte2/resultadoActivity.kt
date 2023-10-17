package net.iessochoa.hectormanuelgelardosabater.practica1parte2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class resultadoActivity : AppCompatActivity() {
    companion object {
        val EXTRA_NUMERO = "Practica1Parte2.resultadoActivity.numero"
    }

    private lateinit var tvResultado: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        //asignamos la instancia de tvResultado en onCreate
        tvResultado=findViewById(R.id.tvResultado)
        //recuperamos el valor enviado por MainActivity
        val numero=intent.getStringExtra(EXTRA_NUMERO)
        tvResultado.text= String.format(getString(R.string.resultado),numero)
    }


}