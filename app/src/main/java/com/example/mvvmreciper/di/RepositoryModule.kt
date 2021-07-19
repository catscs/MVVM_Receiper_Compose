package com.example.mvvmreciper.di

import com.example.mvvmreciper.network.RecipeService
import com.example.mvvmreciper.network.model.RecipeDtoMapper
import com.example.mvvmreciper.repository.RecipeRepository
import com.example.mvvmreciper.repository.RecipeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService, recipeDtoMapper: RecipeDtoMapper
    ): RecipeRepository {
        return RecipeRepositoryImpl(recipeService, recipeDtoMapper)
    }
}