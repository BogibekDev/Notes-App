package dev.bogibek.eslatmalar.feature_notes.presentation.notes

import dev.bogibek.eslatmalar.feature_notes.domain.model.Note
import dev.bogibek.eslatmalar.feature_notes.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSelection : NotesEvent()

}
