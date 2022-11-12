package com.kk.moviekotlinmvvm.Repository

import com.kk.moviekotlinmvvm.Services.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun  getAllMovies() = retrofitService.getAllMovies()

}