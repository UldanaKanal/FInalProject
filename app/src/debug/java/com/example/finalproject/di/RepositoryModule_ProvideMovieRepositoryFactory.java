package com.example.finalproject.di;

import com.example.finalproject.data.db.WatchListMovieDao;
import com.example.finalproject.data.network.api.MovieApi;
import com.example.finalproject.domain.repository.MovieRepository;
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
public final class RepositoryModule_ProvideMovieRepositoryFactory implements Factory<MovieRepository> {
  private final Provider<MovieApi> apiProvider;

  private final Provider<WatchListMovieDao> watchListMovieDaoProvider;

  public RepositoryModule_ProvideMovieRepositoryFactory(Provider<MovieApi> apiProvider,
      Provider<WatchListMovieDao> watchListMovieDaoProvider) {
    this.apiProvider = apiProvider;
    this.watchListMovieDaoProvider = watchListMovieDaoProvider;
  }

  @Override
  public MovieRepository get() {
    return provideMovieRepository(apiProvider.get(), watchListMovieDaoProvider.get());
  }

  public static RepositoryModule_ProvideMovieRepositoryFactory create(
      Provider<MovieApi> apiProvider, Provider<WatchListMovieDao> watchListMovieDaoProvider) {
    return new RepositoryModule_ProvideMovieRepositoryFactory(apiProvider, watchListMovieDaoProvider);
  }

  public static MovieRepository provideMovieRepository(MovieApi api,
      WatchListMovieDao watchListMovieDao) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideMovieRepository(api, watchListMovieDao));
  }
}
