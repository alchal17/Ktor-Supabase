package com.example

import com.example.db.configureDatabase
import com.example.db.configureTables
import com.example.routing.configureRouting
import io.ktor.server.application.*
import java.util.TimeZone

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"))
    configureSerialization()
    configureDatabase()
    configureTables()
    configureFrameworks()
    configureRouting()
}
