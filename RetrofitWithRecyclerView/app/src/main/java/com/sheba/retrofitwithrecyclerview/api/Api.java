package com.sheba.retrofitwithrecyclerview.api;

import com.sheba.retrofitwithrecyclerview.model.Category;
import com.sheba.retrofitwithrecyclerview.model.CategoryItem;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://api.dev-sheba.xyz";

    @GET("/v3/categories/17")
    Call<CategoryItem> getCategories();

}
