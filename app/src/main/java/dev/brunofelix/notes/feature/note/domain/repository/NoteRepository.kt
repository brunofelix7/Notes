package dev.brunofelix.notes.feature.note.domain.repository

import dev.brunofelix.notes.feature.note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun insert(note: Note)

    suspend fun update(note: Note)

    suspend fun delete(note: Note)

    suspend fun getById(id: Long): Note?

    fun getAll(): Flow<List<Note>>
}