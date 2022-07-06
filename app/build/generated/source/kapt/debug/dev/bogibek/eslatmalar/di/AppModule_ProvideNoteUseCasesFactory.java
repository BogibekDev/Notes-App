// Generated by Dagger (https://dagger.dev).
package dev.bogibek.eslatmalar.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.bogibek.eslatmalar.feature_notes.domain.repository.NoteRepository;
import dev.bogibek.eslatmalar.feature_notes.domain.use_case.NoteUseCases;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideNoteUseCasesFactory implements Factory<NoteUseCases> {
  private final Provider<NoteRepository> repositoryProvider;

  public AppModule_ProvideNoteUseCasesFactory(Provider<NoteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public NoteUseCases get() {
    return provideNoteUseCases(repositoryProvider.get());
  }

  public static AppModule_ProvideNoteUseCasesFactory create(
      Provider<NoteRepository> repositoryProvider) {
    return new AppModule_ProvideNoteUseCasesFactory(repositoryProvider);
  }

  public static NoteUseCases provideNoteUseCases(NoteRepository repository) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNoteUseCases(repository));
  }
}
