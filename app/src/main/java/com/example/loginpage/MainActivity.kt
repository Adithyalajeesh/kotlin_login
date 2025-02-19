package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {

            val username = binding.userName.text.toString()
            val password = binding.password.text.toString()


            if(username=="user" && password=="1234"){
                Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Login  Failed",Toast.LENGTH_SHORT).show()

            }



        })
    }
}