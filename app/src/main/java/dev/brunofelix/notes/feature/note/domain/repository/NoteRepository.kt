package dev.brunofelix.notes.feature.note.domain.repository

import dev.brunofelix.notes.feature.note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    suspend fun insert(note: Note): Long

    suspend fun update(note: Note): Int

    suspend fun delete(note: Note): Int

    suspend fun getById(id: Long): Note?

    fun getAll(): Flow<List<Note>?>
}