package com.ela.testesobre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ela.testesobre.databinding.ActivityActSobreBinding
import com.ela.testesobre.databinding.ActivityMainBinding

class actSobre : AppCompatActivity() {
    private lateinit var binding:ActivityActSobreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActSobreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolbarSobre
        toolbar.title = "Sobre: "
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setBackgroundColor(getColor(R.color.purple))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}