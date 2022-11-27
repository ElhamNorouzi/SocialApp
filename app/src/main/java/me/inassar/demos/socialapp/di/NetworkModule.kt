package me.inassar.demos.socialapp.di

import me.inassar.demos.socialapp.data.remote.source.AuthRemote
import me.inassar.demos.socialapp.data.remote.source.AuthRemoteImpl
import me.inassar.demos.socialapp.data.remote.source.ChatRemote
import me.inassar.demos.socialapp.data.remote.source.ChatRemoteImpl
import org.koin.dsl.module

val networkModule = module {
    single<AuthRemote> { AuthRemoteImpl(get()) }
    single<ChatRemote> { ChatRemoteImpl(get()) }
}