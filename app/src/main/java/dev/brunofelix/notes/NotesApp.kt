package dev.brunofelix.notes

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import dev.brunofelix.notes.core.util.NotesUtil

@HiltAndroidApp
class NotesApp : Application() {

    override fun onCreate() {
        super.onCreate()
        NotesUtil.setDarkMode(false)
        NotesUtil.initTimber()
    }
}