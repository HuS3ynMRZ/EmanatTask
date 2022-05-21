package com.example.emanattask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.emanattask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun parolYoxla(view : View){
        val email = binding.emailText.text.toString()
        val parol = binding.parolText.text.toString()
        if (parol == null || email == null){
            Toast.makeText(applicationContext,"Parol və ya Email boş buraxıla bilməz",Toast.LENGTH_LONG).show()
        } else {
            if(email == "emanat@emanat.az"){
                if (parol == "password123"){
                    Toast.makeText(applicationContext,"Giriş uğurludur!",Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(applicationContext,"Parol yanlışdır!",Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(applicationContext,"Email yanlışdır!",Toast.LENGTH_LONG).show()
            }
        }
    }
}