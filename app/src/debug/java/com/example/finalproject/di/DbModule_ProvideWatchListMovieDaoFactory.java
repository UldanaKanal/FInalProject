package com.example.finalproject.di;

import com.example.finalproject.data.db.AppDataBase;
import com.example.finalproject.data.db.WatchListMovieDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DbModule_ProvideWatchListMovieDaoFactory implements Factory<WatchListMovieDao> {
  private final Provider<AppDataBase> dbProvider;

  public DbModule_ProvideWatchListMovieDaoFactory(Provider<AppDataBase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public WatchListMovieDao get() {
    return provideWatchListMovieDao(dbProvider.get());
  }

  public static DbModule_ProvideWatchListMovieDaoFactory create(Provider<AppDataBase> dbProvider) {
    return new DbModule_ProvideWatchListMovieDaoFactory(dbProvider);
  }

  public static WatchListMovieDao provideWatchListMovieDao(AppDataBase db) {
    return Preconditions.checkNotNullFromProvides(DbModule.INSTANCE.provideWatchListMovieDao(db));
  }
}
