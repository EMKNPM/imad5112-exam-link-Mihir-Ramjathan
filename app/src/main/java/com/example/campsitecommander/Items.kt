package com.example.campsitecommander

data class Items(
    val itemName: String,

    val category: String,

    var quantity: Int = 0,

    val comments: String,
)
