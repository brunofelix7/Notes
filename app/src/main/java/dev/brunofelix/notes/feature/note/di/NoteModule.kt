package dev.brunofelix.notes.feature.note.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.brunofelix.notes.feature.note.domain.repository.NoteRepository
import dev.brunofelix.notes.feature.note.domain.use_case.CreateNoteUseCase
import dev.brunofelix.notes.feature.note.domain.use_case.DeleteNoteUseCase
import dev.brunofelix.notes.feature.note.domain.use_case.GetAllNotesUseCase
import dev.brunofelix.notes.feature.note.domain.use_case.GetNoteByIdUseCase
import dev.brunofelix.notes.feature.note.domain.use_case.NoteUseCase
import dev.brunofelix.notes.feature.note.domain.use_case.UpdateNoteUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteModule {

    @Provides
    @Singleton
    fun provideCreateNoteUseCase(
        repository: NoteRepository
    ) = CreateNoteUseCase(repository)

    @Provides
    @Singleton
    fun provideUpdateNoteUseCase(
        repository: NoteRepository
    ) = UpdateNoteUseCase(repository)

    @Provides
    @Singleton
    fun provideDeleteNoteUseCase(
        repository: NoteRepository
    ) = DeleteNoteUseCase(repository)

    @Provides
    @Singleton
    fun provideGetNoteByIdUseCase(
        repository: NoteRepository
    ) = GetNoteByIdUseCase(repository)

    @Provides
    @Singleton
    fun provideGetAllNotesUseCase(
        repository: NoteRepository
    ) = GetAllNotesUseCase(repository)

    @Provides
    @Singleton
    fun provideNoteUseCase(repository: NoteRepository): NoteUseCase {
        return NoteUseCase(
            create = CreateNoteUseCase(repository),
            update = UpdateNoteUseCase(repository),
            delete = DeleteNoteUseCase(repository),
            getById = GetNoteByIdUseCase(repository),
            getAll = GetAllNotesUseCase(repository)
        )
    }
}