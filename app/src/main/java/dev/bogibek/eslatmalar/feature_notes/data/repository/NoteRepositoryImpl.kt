package dev.bogibek.eslatmalar.feature_notes.data.repository

import dev.bogibek.eslatmalar.feature_notes.data.data_source.NoteDao
import dev.bogibek.eslatmalar.feature_notes.domain.model.Note
import dev.bogibek.eslatmalar.feature_notes.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(private val dao:NoteDao):NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}