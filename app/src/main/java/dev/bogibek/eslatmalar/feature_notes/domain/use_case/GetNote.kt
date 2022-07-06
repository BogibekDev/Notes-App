package dev.bogibek.eslatmalar.feature_notes.domain.use_case

import dev.bogibek.eslatmalar.feature_notes.domain.model.Note
import dev.bogibek.eslatmalar.feature_notes.domain.repository.NoteRepository

class GetNote(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}