package ir.mjkhaani.recipeapp.dependencyInjection

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.mjkhaani.recipeapp.network.RecipeService
import ir.mjkhaani.recipeapp.network.utitlity.RecipeDtoMapper
import ir.mjkhaani.recipeapp.repository.RecipeRepository
import ir.mjkhaani.recipeapp.repository.RecipeRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(
        recipeService: RecipeService,
        recipeDtoMapper: RecipeDtoMapper
    ): RecipeRepository {
        return RecipeRepositoryImpl(recipeService, recipeDtoMapper)
    }
}