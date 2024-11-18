package dev.brunofelix.notes.feature.note.domain.use_case

import dev.brunofelix.notes.core.data.local.ResultState
import dev.brunofelix.notes.core.util.LogUtil
import dev.brunofelix.notes.core.util.NotesMessage
import dev.brunofelix.notes.feature.note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetNoteByIdUseCase @Inject constructor(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Long) = flow {
        try {
            emit(ResultState.Loading())

            val result = repository.getById(id)

            emit(ResultState.Success(data = result))
        } catch (e: Exception) {
            LogUtil.error("GetNoteByIdNoteUseCase - $e")
            emit(ResultState.Error(message = NotesMessage.ERROR))
        }
    }
}