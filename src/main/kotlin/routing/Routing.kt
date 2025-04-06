package com.example.routing

import com.example.repositories.UserRepository
import com.example.repositories.WorkRepository
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val userRepository by inject<UserRepository>()
    val workRepository by inject<WorkRepository>()
    routing {
        get("/") {
            call.respondText("Api server is running")
        }
        userRouting(userRepository)
        workRouting(workRepository)
    }
}
