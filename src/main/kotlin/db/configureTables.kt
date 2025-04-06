package com.example.db

import com.example.models.database_representations.Users
import com.example.models.database_representations.Works
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun configureTables() {
    transaction {
        val tables = listOf(Users, Works)
        tables.forEach { table -> SchemaUtils.create(table) }
    }
}