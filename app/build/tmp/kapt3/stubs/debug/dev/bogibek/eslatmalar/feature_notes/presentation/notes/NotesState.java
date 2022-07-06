package dev.bogibek.eslatmalar.feature_notes.presentation.notes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\bH\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Ldev/bogibek/eslatmalar/feature_notes/presentation/notes/NotesState;", "", "notes", "", "Ldev/bogibek/eslatmalar/feature_notes/domain/model/Note;", "noteOrder", "Ldev/bogibek/eslatmalar/feature_notes/domain/util/NoteOrder;", "isOrderSelectionVisible", "", "(Ljava/util/List;Ldev/bogibek/eslatmalar/feature_notes/domain/util/NoteOrder;Z)V", "()Z", "getNoteOrder", "()Ldev/bogibek/eslatmalar/feature_notes/domain/util/NoteOrder;", "getNotes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class NotesState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<dev.bogibek.eslatmalar.feature_notes.domain.model.Note> notes = null;
    @org.jetbrains.annotations.NotNull()
    private final dev.bogibek.eslatmalar.feature_notes.domain.util.NoteOrder noteOrder = null;
    private final boolean isOrderSelectionVisible = false;
    
    @org.jetbrains.annotations.NotNull()
    public final dev.bogibek.eslatmalar.feature_notes.presentation.notes.NotesState copy(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.bogibek.eslatmalar.feature_notes.domain.model.Note> notes, @org.jetbrains.annotations.NotNull()
    dev.bogibek.eslatmalar.feature_notes.domain.util.NoteOrder noteOrder, boolean isOrderSelectionVisible) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NotesState() {
        super();
    }
    
    public NotesState(@org.jetbrains.annotations.NotNull()
    java.util.List<dev.bogibek.eslatmalar.feature_notes.domain.model.Note> notes, @org.jetbrains.annotations.NotNull()
    dev.bogibek.eslatmalar.feature_notes.domain.util.NoteOrder noteOrder, boolean isOrderSelectionVisible) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dev.bogibek.eslatmalar.feature_notes.domain.model.Note> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dev.bogibek.eslatmalar.feature_notes.domain.model.Note> getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.bogibek.eslatmalar.feature_notes.domain.util.NoteOrder component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dev.bogibek.eslatmalar.feature_notes.domain.util.NoteOrder getNoteOrder() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isOrderSelectionVisible() {
        return false;
    }
}