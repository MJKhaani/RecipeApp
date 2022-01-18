package ir.mjkhaani.recipeapp.network.model

import com.google.gson.annotations.SerializedName

data class RecipeDto(
    @SerializedName(value = "pk")
    var pk: Int? = null,
    @SerializedName(value = "title")
    var title: String? = null,
    @SerializedName(value = "featured_image")
    var featuredImage: String? = null,
    @SerializedName(value = "publisher")
    var publisher: String? = null,
    @SerializedName(value = "rating")
    var rating: Int? = null,
    @SerializedName(value = "source_url")
    var sourceUrl: String? = null,
    @SerializedName(value = "description")
    var description: String? = null,
    @SerializedName(value = "cooking_instructions")
    var cookingInstructions: String? = null,
    @SerializedName(value = "ingredients")
    var ingredients: List<String>? = null,
    @SerializedName(value = "date_added")
    var dateAdded: String? = null,
    @SerializedName(value = "date_updated")
    var dateUpdated: String? = null,
)