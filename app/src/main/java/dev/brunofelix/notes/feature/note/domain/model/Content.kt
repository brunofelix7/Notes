package dev.brunofelix.notes.feature.note.domain.model

data class Content(
    val text: String,
    val isDone: Boolean? = null
)