package ir.mjkhaani.recipeapp.persentation.ui.recipeList

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel
@Inject
constructor(
    private val token: String
) : ViewModel() {
    init {
        println("view model: $token")
    }
}