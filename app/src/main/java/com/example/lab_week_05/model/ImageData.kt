package com.example.lab_week_05.model
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImageData(
    @Json(name = "url") val url: String,
    val breeds: List<CatBreedData>? = emptyList()
)