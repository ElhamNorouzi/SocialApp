package me.inassar.demos.socialapp.di

import me.inassar.demos.socialapp.common.ktorHttpClient
import org.koin.dsl.module


val appModule = module {
    single { ktorHttpClient }
}