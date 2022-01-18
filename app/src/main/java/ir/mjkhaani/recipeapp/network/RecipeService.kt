package ir.mjkhaani.recipeapp.network

import ir.mjkhaani.recipeapp.network.model.RecipeDto
import ir.mjkhaani.recipeapp.network.responses.RecipeSearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RecipeService{
    @GET( "search")
    suspend fun search(
        @Header("Authorization") token:String,
        @Query("page") page:Int,
        @Query("query") query: String
    ):RecipeSearchResponse

    @GET("get")
    suspend fun get(
        @Header("Authorization") token:String,
        @Query("id") id:Int,
    ):RecipeDto
}