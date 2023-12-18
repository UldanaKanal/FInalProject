package com.example.finalproject.presentation.screen.detail;

import com.example.finalproject.data.db.WatchListMovieDao;
import com.example.finalproject.data.network.api.MovieApi;
import com.example.finalproject.data.repository.MovieRepositoryImpl;

import javax.inject.Provider;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieDetailsViewModel_Factory implements Factory<MovieRepositoryImpl> {
  private final Provider<MovieApi> apiProvider;

  private final Provider<WatchListMovieDao> watchListMovieDaoProvider;

  public MovieDetailsViewModel_Factory(Provider<MovieApi> apiProvider,
                                       Provider<WatchListMovieDao> watchListMovieDaoProvider) {
    this.apiProvider = apiProvider;
    this.watchListMovieDaoProvider = watchListMovieDaoProvider;
  }

  @Override
  public MovieRepositoryImpl get() {
    return newInstance(apiProvider.get(), watchListMovieDaoProvider.get());
  }

  public static MovieDetailsViewModel_Factory create(Provider<MovieApi> apiProvider,
                                                     Provider<WatchListMovieDao> watchListMovieDaoProvider) {
    return new MovieDetailsViewModel_Factory(apiProvider, watchListMovieDaoProvider);
  }

  public static MovieRepositoryImpl newInstance(MovieApi api, WatchListMovieDao watchListMovieDao) {
    return new MovieRepositoryImpl(api, watchListMovieDao);
  }
}
