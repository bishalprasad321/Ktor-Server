package com.bishal.plugins

import io.ktor.server.plugins.callloging.*
import io.ktor.server.application.*

fun Application.configureMonitoring() {
    install(CallLogging)
}
