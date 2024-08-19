package com.example.contador

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var amb: ActivityMainBinding
    private var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)


        amb.inicialSp.onItemSelectedListener = object: OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?, //o proprio spinner com todos os objetos
                view: View?, //item que foi clicado
                position: Int, //tipo da posição 1
                id: Long //como não definiu um ID, um ID genérico é criado
            )
            {
                contador = when(position){
                    0 -> 0
                    1 -> 5
                    2 -> 10
                    else -> 0 //Necessário para esgotar as opções quando when é usado como expressão.
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //NSA
            }
        }

        amb.CliqueBt.setOnClickListener{
            amb.contadorTv.text = ((++contador).toString())
        }
    }
}
