package dev.brunofelix.notes.feature.note.domain.model

import dev.brunofelix.notes.core.data.local.entity.NoteEntity
import dev.brunofelix.notes.core.presentation.ui.theme.Colors
import dev.brunofelix.notes.core.util.ContentType

data class Note(
    val id: Long? = null,
    val title: String,
    val content: String,
    val color: Int,
    val type: ContentType,
    val createdAt: Long
) {
    fun toNoteEntity() = NoteEntity(
        id = id,
        title = title,
        content = content,
        color = color,
        type = type,
        createdAt = createdAt
    )

    // Note colors
    companion object {
        val noteColors = listOf(
            Colors.White,
            Colors.Blue,
            Colors.Green,
            Colors.Gold,
            Colors.Orange
        )
    }

    // Fake list
    val fakeNotes = listOf(
        Note(
            id = 1,
            title = "Title 1",
            content = "Content 1",
            color = 1,
            type = ContentType.PLAIN_TEXT,
            createdAt = 0
        ),
        Note(
            id = 2,
            title = "Title 2",
            content = "Content 2",
            color = 2,
            type = ContentType.TOPICS,
            createdAt = 0
        ),
        Note(
            id = 3,
            title = "Title 1",
            content = "Content 3",
            color = 3,
            type = ContentType.CHECKLIST,
            createdAt = 0
        )
    )
}