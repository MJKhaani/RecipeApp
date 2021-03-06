package ir.mjkhaani.recipeapp.repository

import ir.mjkhaani.recipeapp.domain.model.Recipe
import ir.mjkhaani.recipeapp.network.RecipeService
import ir.mjkhaani.recipeapp.network.utitlity.RecipeDtoMapper


class RecipeRepositoryImpl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper
) : RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.search(token, page, query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token,id))
    }
}