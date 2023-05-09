package com.jisellemartins.aluvery.extensions

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.*

fun BigDecimal.toBrazilizanCurrency(): String{
    return NumberFormat.getCurrencyInstance(Locale("pt","br")).format(this)
}