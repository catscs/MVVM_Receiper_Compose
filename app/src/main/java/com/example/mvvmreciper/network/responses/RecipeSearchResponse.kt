package com.example.mvvmreciper.network.responses

import com.example.mvvmreciper.network.model.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName


class RecipeSearchResponse(
    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var results: List<RecipeNetworkEntity>,
)