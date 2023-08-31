package com.test.applemarket

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SaleItem(
    val imageResource : Int,
    val productName : String,
    val description : String,
    val owner : String,
    val price : Int,
    val location : String,
    val like : Int,
    val chatting : Int
) : Parcelable