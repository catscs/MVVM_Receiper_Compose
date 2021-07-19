package com.example.mvvmreciper.presentation.ui.recipe_list

import androidx.lifecycle.ViewModel
import com.example.mvvmreciper.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RecipeListViewModel @Inject constructor(
    private val repository: RecipeRepository,
    @Named("auth_token") private val token: String
) : ViewModel() {

    init {
        //repository.search(token)
    }

    fun getRepo() = repository

    fun getToken() = token
}