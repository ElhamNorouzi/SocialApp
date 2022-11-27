package me.inassar.demos.socialapp.di

import me.inassar.demos.socialapp.common.SessionPrefs
import me.inassar.demos.socialapp.common.SessionPrefsImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val cacheModule = module {
    single <SessionPrefs>{ SessionPrefsImpl(androidContext()) }
}