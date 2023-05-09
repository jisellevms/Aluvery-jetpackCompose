package com.jisellemartins.aluvery.sampledata

import com.jisellemartins.aluvery.R
import com.jisellemartins.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(

    Product(
        name = "Hamburguer", price = BigDecimal("12.99"), R.drawable.burguer
    ),


    Product(
        name = "Pizza", price = BigDecimal("19.99"), R.drawable.pizza
    ),


    Product(
        name = "Batata frita", price = BigDecimal("8.99"), R.drawable.fries
    )

)