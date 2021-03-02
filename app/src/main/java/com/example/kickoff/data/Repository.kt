package com.example.kickoff.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class Repository {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://imdb8.p.rapidapi.com/actors/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    private val actorService = retrofit.create(ActorService::class.java)

    suspend fun listBorn() = actorService.listBorn()
}