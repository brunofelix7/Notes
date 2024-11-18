package dev.brunofelix.notes.core.data.local.repository

import dev.brunofelix.notes.core.data.local.dao.NoteDao
import dev.brunofelix.notes.feature.note.domain.model.Note
import dev.brunofelix.notes.feature.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val dao: NoteDao
) : NoteRepository {
    override suspend fun insert(note: Note) = dao.insert(note.toNoteEntity())

    override suspend fun update(note: Note) = dao.update(note.toNoteEntity())

    override suspend fun delete(note: Note) = dao.delete(note.toNoteEntity())

    override suspend fun getById(id: Long) = dao.getById(id)?.toNote()

    override fun getAll() = dao.getAll().map { entityList ->
        entityList?.map { entity ->
            entity.toNote()
        }
    }
}