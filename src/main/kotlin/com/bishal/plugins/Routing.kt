package com.bishal.plugins

import com.bishal.routes.root
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        root()
    }
}
