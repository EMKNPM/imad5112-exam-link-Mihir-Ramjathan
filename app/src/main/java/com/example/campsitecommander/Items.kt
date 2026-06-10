package com.example.campsitecommander

import android.widget.EditText

data class Items(
    val itemName: String,

    val category: String,

    var quantity: EditText,

    val comments: String,
)
