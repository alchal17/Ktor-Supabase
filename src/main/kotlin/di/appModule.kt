package com.example.di

import com.example.repositories.UserRepository
import com.example.repositories.WorkRepository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {
    singleOf(::UserRepository)
    singleOf(::WorkRepository)
}