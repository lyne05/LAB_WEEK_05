package com.example.lab_week_05.model
import com.squareup.moshi.JsonClass
@JsonClass(generateAdapter = true)
data class CatBreedData(
    val name: String?,
    val temperament: String?
)