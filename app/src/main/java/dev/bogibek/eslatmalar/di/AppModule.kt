package dev.bogibek.eslatmalar.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.bogibek.eslatmalar.feature_notes.data.data_source.NoteDatabase
import dev.bogibek.eslatmalar.feature_notes.data.data_source.NoteDatabase.Companion.DATABASE_NAME
import dev.bogibek.eslatmalar.feature_notes.data.repository.NoteRepositoryImpl
import dev.bogibek.eslatmalar.feature_notes.domain.repository.NoteRepository
import dev.bogibek.eslatmalar.feature_notes.domain.use_case.*
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository),
        )
    }

}