package dev.brunofelix.notes.core.data.local

sealed class ResultState<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Loading<T>: ResultState<T>()
    class Success<T>(data: T? = null): ResultState<T>(data = data)
    class Error<T>(message: String? = null): ResultState<T>(message = message)
}