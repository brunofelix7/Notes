package dev.brunofelix.notes.core.data.local.converter

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import dev.brunofelix.notes.core.util.ContentType

@ProvidedTypeConverter
class Converters {

    @TypeConverter
    fun toContentType(type: String) = enumValueOf<ContentType>(type)

    @TypeConverter
    fun fromContentType(type: ContentType) = type.value
}