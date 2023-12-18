package com.example.finalproject.data.repository;

import com.example.finalproject.data.db.WatchListMovieDao;
import com.example.finalproject.data.network.api.MovieApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieRepositoryImpl_Factory implements Factory<MovieRepositoryImpl> {
  private final Provider<MovieApi> apiProvider;

  private final Provider<WatchListMovieDao> watchListMovieDaoProvider;

  public MovieRepositoryImpl_Factory(Provider<MovieApi> apiProvider,
      Provider<WatchListMovieDao> watchListMovieDaoProvider) {
    this.apiProvider = apiProvider;
    this.watchListMovieDaoProvider = watchListMovieDaoProvider;
  }

  @Override
  public MovieRepositoryImpl get() {
    return newInstance(apiProvider.get(), watchListMovieDaoProvider.get());
  }

  public static MovieRepositoryImpl_Factory create(Provider<MovieApi> apiProvider,
      Provider<WatchListMovieDao> watchListMovieDaoProvider) {
    return new MovieRepositoryImpl_Factory(apiProvider, watchListMovieDaoProvider);
  }

  public static MovieRepositoryImpl newInstance(MovieApi api, WatchListMovieDao watchListMovieDao) {
    return new MovieRepositoryImpl(api, watchListMovieDao);
  }
}
