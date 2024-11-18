package dev.brunofelix.notes.core.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import dev.brunofelix.notes.core.util.ContentType
import dev.brunofelix.notes.feature.note.domain.model.Note

@Entity(tableName = "notes")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = null,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "content")
    val content: String,

    @ColumnInfo(name = "color")
    val color: Int,

    @ColumnInfo(name = "type")
    val type: ContentType,

    @ColumnInfo(name = "createdAt")
    val createdAt: Long
) {
    fun toNote() = Note(
        id = id,
        title = title,
        content = content,
        color = color,
        type = type,
        createdAt = createdAt
    )
}