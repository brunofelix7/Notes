package dev.brunofelix.notes.feature.note.domain.use_case

data class NoteUseCase (
    val create: CreateNoteUseCase,
    val update: UpdateNoteUseCase,
    val delete: DeleteNoteUseCase,
    val getById: GetNoteByIdUseCase,
    val getAll: GetAllNotesUseCase
)