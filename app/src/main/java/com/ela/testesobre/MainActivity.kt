package com.ela.testesobre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.ela.testesobre.databinding.ActivityMainBinding

 private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgSobre.setOnClickListener(){
            val intent = Intent(this, actSobre::class.java)
            startActivity(intent)
        }
        binding.imgRotina.setOnClickListener(){
            val intent = Intent(this, actRotina::class.java)
            startActivity(intent)
        }
        binding.imgContatos.setOnClickListener(){
            val intent = Intent(this, actContatos::class.java)
            startActivity(intent)
        }
    }
}