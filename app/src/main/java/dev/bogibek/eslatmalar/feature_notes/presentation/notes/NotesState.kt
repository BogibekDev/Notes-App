package dev.bogibek.eslatmalar.feature_notes.presentation.notes

import dev.bogibek.eslatmalar.feature_notes.domain.model.Note
import dev.bogibek.eslatmalar.feature_notes.domain.util.NoteOrder
import dev.bogibek.eslatmalar.feature_notes.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false,
)
