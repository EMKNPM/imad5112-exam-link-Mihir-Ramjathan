package com.example.campsitecommander

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {

    //Declarations
    private lateinit var edtName: EditText
    private lateinit var edtCategory: EditText
    private lateinit var edtQuantity: EditText
    private lateinit var edtComment: EditText

    private lateinit var btnAddItem: Button
    private lateinit var btnTotal: Button
    private lateinit var btnDetail: Button
    private lateinit var tvTotal: TextView
    private lateinit var spinner: Spinner


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        //typecasting
        spinner = findViewById(R.id.spinner)
        edtName = findViewById(R.id.edtName)
        edtCategory = findViewById(R.id.edtCategory)
        edtQuantity = findViewById(R.id.edtQuantity)
        edtComment = findViewById(R.id.edtComment)
        btnAddItem = findViewById(R.id.btnAddItem)
        btnTotal = findViewById(R.id.btnTotal)
        btnDetail = findViewById(R.id.btnDetail)
        tvTotal = findViewById(R.id.tvTotal)



        // saves data for the item
        btnAddItem.setOnClickListener {
            addItem()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun addItem() {
    }
}

