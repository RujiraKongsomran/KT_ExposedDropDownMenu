package com.rujirakongsomran.kt_exposeddropdownmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.rujirakongsomran.kt_exposeddropdownmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val language = resources.getStringArray(R.array.language)
        val arrayAdapter = ArrayAdapter(applicationContext, R.layout.dropdown_item, language)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }
}