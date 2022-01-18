package ir.mjkhaani.recipeapp.persentation.ui.recipeList

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RecipeListViewModel
@Inject
constructor(
    @Named("auth_token")
    private val token: String
) : ViewModel() {
    init {
        println("view model: $token")
    }
}