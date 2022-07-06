package dev.bogibek.eslatmalar.feature_notes.domain.use_case

import dev.bogibek.eslatmalar.App
import dev.bogibek.eslatmalar.R
import dev.bogibek.eslatmalar.feature_notes.domain.model.InvalidNodeException
import dev.bogibek.eslatmalar.feature_notes.domain.model.Note
import dev.bogibek.eslatmalar.feature_notes.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {
    @Throws(InvalidNodeException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNodeException(App.context!!.getString(R.string.str_title_not_empty))
        }
        if (note.content.isBlank()) {
            throw InvalidNodeException(App.context!!.getString(R.string.str_content_not_empty))
        }
        repository.insertNote(note)
    }
}