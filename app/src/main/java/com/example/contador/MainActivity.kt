package com.example.contador

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
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


        amb.zeroRb.setOnClickListener{
            contador = amb.zeroRb.text.toString().toInt()

            amb.dezRb.setOnClickListener{
                contador = 10
            }
        }

        amb.CliqueBt.setOnClickListener{
            amb.contadorTv.text = ((++contador).toString())
        }
    }
}
