package dev.brunofelix.notes.core.util

import timber.log.Timber

object LogUtil {

    fun info(message: String) {
        Timber.tag("Notes_Log").i("INFO -> $message")
    }

    fun error(message: String) {
        Timber.tag("Notes_Log").e("ERROR -> $message")
    }
}