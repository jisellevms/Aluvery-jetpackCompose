package com.jisellemartins.aluvery.model

import androidx.annotation.DrawableRes
import com.jisellemartins.aluvery.R
import java.math.BigDecimal

class Product(
    val name: String,
    val price: BigDecimal,
    @DrawableRes val image: Int
)
