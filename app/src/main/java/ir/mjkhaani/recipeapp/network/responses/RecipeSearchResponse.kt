package ir.mjkhaani.recipeapp.network.responses

import com.google.gson.annotations.SerializedName
import ir.mjkhaani.recipeapp.network.model.RecipeDto

data class RecipeSearchResponse(
    @SerializedName(value = "count")
    var count:Int,
    @SerializedName(value ="result")
    var recipes:List<RecipeDto>
)