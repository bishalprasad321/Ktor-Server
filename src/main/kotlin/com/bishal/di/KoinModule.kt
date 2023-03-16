package com.bishal.di

import com.bishal.repository.HeroRepository
import com.bishal.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}