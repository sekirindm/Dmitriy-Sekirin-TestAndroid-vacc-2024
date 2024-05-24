package com.example.premierconsultproject.data.network.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Products(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("price") val price: Double,
    @SerializedName("image") val image: String,
    @SerializedName("rating") val rating: Rating

) : Parcelable
@Parcelize
data class Rating(
    @SerializedName("rate") val rate: Double,
    @SerializedName("count") val count: Int,
) : Parcelable