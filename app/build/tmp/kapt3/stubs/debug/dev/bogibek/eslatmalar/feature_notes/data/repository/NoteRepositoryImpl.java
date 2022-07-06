package dev.bogibek.eslatmalar.feature_notes.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000fH\u0016J\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Ldev/bogibek/eslatmalar/feature_notes/data/repository/NoteRepositoryImpl;", "Ldev/bogibek/eslatmalar/feature_notes/domain/repository/NoteRepository;", "dao", "Ldev/bogibek/eslatmalar/feature_notes/data/data_source/NoteDao;", "(Ldev/bogibek/eslatmalar/feature_notes/data/data_source/NoteDao;)V", "deleteNote", "", "note", "Ldev/bogibek/eslatmalar/feature_notes/domain/model/Note;", "(Ldev/bogibek/eslatmalar/feature_notes/domain/model/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoteById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotes", "Lkotlinx/coroutines/flow/Flow;", "", "insertNote", "app_debug"})
public final class NoteRepositoryImpl implements dev.bogibek.eslatmalar.feature_notes.domain.repository.NoteRepository {
    private final dev.bogibek.eslatmalar.feature_notes.data.data_source.NoteDao dao = null;
    
    public NoteRepositoryImpl(@org.jetbrains.annotations.NotNull()
    dev.bogibek.eslatmalar.feature_notes.data.data_source.NoteDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<dev.bogibek.eslatmalar.feature_notes.domain.model.Note>> getNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNoteById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super dev.bogibek.eslatmalar.feature_notes.domain.model.Note> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertNote(@org.jetbrains.annotations.NotNull()
    dev.bogibek.eslatmalar.feature_notes.domain.model.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    dev.bogibek.eslatmalar.feature_notes.domain.model.Note note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}