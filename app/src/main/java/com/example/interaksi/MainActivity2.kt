package com.example.interaksi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.interaksi.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        binding.btnTampilkan2.setOnClickListener(){
            ubahData()
        }
        setContentView(binding.root)
    }
    private fun ubahData(){

        binding.tvHasil2.text = binding.etName2.text.toString()
    }
}