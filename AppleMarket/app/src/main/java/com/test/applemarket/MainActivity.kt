package com.test.applemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.applemarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val dataList = mutableListOf<SaleItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}