package dev.rsocket.wrapper

import io.rsocket.kotlin.core.CustomMimeType

// Using Core Rsocket
fun RSocket(): CustomMimeType {
    return CustomMimeType("Using RSocket Core")
}
