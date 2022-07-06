package dev.bogibek.eslatmalar.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0007\u00a8\u0006\r"}, d2 = {"Ldev/bogibek/eslatmalar/di/AppModule;", "", "()V", "provideNoteDatabase", "Ldev/bogibek/eslatmalar/feature_notes/data/data_source/NoteDatabase;", "app", "Landroid/app/Application;", "provideNoteRepository", "Ldev/bogibek/eslatmalar/feature_notes/domain/repository/NoteRepository;", "db", "provideNoteUseCases", "Ldev/bogibek/eslatmalar/feature_notes/domain/use_case/NoteUseCases;", "repository", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final dev.bogibek.eslatmalar.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final dev.bogibek.eslatmalar.feature_notes.data.data_source.NoteDatabase provideNoteDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final dev.bogibek.eslatmalar.feature_notes.domain.repository.NoteRepository provideNoteRepository(@org.jetbrains.annotations.NotNull()
    dev.bogibek.eslatmalar.feature_notes.data.data_source.NoteDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final dev.bogibek.eslatmalar.feature_notes.domain.use_case.NoteUseCases provideNoteUseCases(@org.jetbrains.annotations.NotNull()
    dev.bogibek.eslatmalar.feature_notes.domain.repository.NoteRepository repository) {
        return null;
    }
}