package br.com.fiap.minhabibliotecaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.fiap.minhabiblioteca.Calculadora

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var calculadora =  Calculadora()

        var result = calculadora.somar(10, 20)

        Log.i("resultado: ",result.toString())


    }
}
