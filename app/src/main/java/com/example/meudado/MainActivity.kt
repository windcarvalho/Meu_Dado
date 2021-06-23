package com.example.meudado

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.outsidedado.VampiroDoDado
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btRoll:Button = findViewById(R.id.bt_rool)
        btRoll.setOnClickListener {
           // Toast.makeText(this,"Vailha",Toast.LENGTH_LONG).show();
            rollDice()
        }
    }


    private fun rollDice() {
        val randomText:TextView= findViewById(R.id.textView);
        var randomNum:Int = Random.nextInt(6) +1
        //randomText.setText("Num: "+ randomNum)
        randomText.text = "Num: $randomNum"
        randomNum = 7;
        val vamp = VampiroDoDado()

        val dado = Dado()
        dado.valor = 3
        randomText.text= ""+ (dado.valor)
    }
}