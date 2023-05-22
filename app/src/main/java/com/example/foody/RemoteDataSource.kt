package com.example.foody

import com.example.foody.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesAPI: FoodRecipesAPI
) {

    suspend fun getRecipes(queries: Map<String,String>) : Response<FoodRecipe>{
        return foodRecipesAPI.getRecipes(queries)
    }
}