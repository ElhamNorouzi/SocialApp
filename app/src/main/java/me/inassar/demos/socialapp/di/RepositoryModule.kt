package me.inassar.demos.socialapp.di

import me.inassar.demos.socialapp.data.repository.AuthRepositoryImpl
import me.inassar.demos.socialapp.data.repository.ChatRepositoryImpl
import me.inassar.demos.socialapp.domain.repository.AuthRepository
import me.inassar.demos.socialapp.domain.repository.ChatRepository
import org.koin.dsl.module


val repositoryModule = module {
    single<AuthRepository> { AuthRepositoryImpl(get()) }
    single<ChatRepository> { ChatRepositoryImpl(get(), get()) }
}