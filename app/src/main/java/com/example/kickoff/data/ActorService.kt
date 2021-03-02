package com.example.kickoff.data

import retrofit2.http.GET
import retrofit2.http.Headers

interface ActorService {
    @Headers(
        "x-rapidapi-key: e479c02782msh89d12843b2a5c2cp141d1ejsn019b6d59365f",
        "x-rapidapi-host: imdb8.p.rapidapi.com",
        "useQueryString: true"
    )
    @GET("list-born-today?month=7&day=27")
    suspend fun listBorn():List<String>
}