package com.strumenta.kotlinmultiplatform

actual inline fun <R> synchronized(lock: Any, block: () -> R): R {
    // Not needed, JavaScript is single-threaded
    return block()
}

actual inline fun Any.noFreeze() {}