package dev.brunofelix.notes.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.brunofelix.notes.core.data.local.dao.NoteDao
import dev.brunofelix.notes.core.data.local.entity.NoteEntity

@Database(
    entities = [NoteEntity::class],
    exportSchema = false,
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: NoteDao
}