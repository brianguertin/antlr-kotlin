package com.strumenta.kotlinmultiplatform

import kotlin.native.concurrent.ensureNeverFrozen

actual inline fun <R> synchronized(lock: Any, block: () -> R): R {
    // TODO: Not supported by Kotlin/Native
    return block()
}

actual inline fun Any.noFreeze() {
    ensureNeverFrozen()
}