package com.ela.testesobre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ela.testesobre.databinding.ActivityActContatosBinding
import com.ela.testesobre.databinding.ActivityActRotinaBinding

class actContatos : AppCompatActivity() {
    private lateinit var binding: ActivityActContatosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActContatosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolbarContatos

        toolbar.title = "Meus contatos:"
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