package com.ela.testesobre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ela.testesobre.databinding.ActivityActRotinaBinding
import com.ela.testesobre.databinding.ActivityActSobreBinding

class actRotina : AppCompatActivity() {
    private lateinit var binding: ActivityActRotinaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActRotinaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolbarRotina

        toolbar.title = "Minha rotina:"
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