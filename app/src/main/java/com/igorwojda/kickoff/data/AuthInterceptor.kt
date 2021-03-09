package com.igorwojda.kickoff.data

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response = chain
        .request()
        .newBuilder()
        .header("sassa", "asa")
        .build()
        .let { chain.proceed(it) }
}