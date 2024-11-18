package dev.brunofelix.notes.feature.note.domain.use_case

import dev.brunofelix.notes.core.data.local.ResultState
import dev.brunofelix.notes.core.util.LogUtil
import dev.brunofelix.notes.core.util.NotesMessage
import dev.brunofelix.notes.feature.note.domain.model.Note
import dev.brunofelix.notes.feature.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) = flow {
        try {
            emit(ResultState.Loading())

            val result = repository.delete(note)

            if (result > 0) {
                emit(ResultState.Success(data = result))
            } else {
                emit(ResultState.Error(message = NotesMessage.ERROR))
            }
        } catch (e: Exception) {
            LogUtil.error("DeleteNoteUseCase - $e")
            emit(ResultState.Error(message = NotesMessage.ERROR))
        }
    }
}