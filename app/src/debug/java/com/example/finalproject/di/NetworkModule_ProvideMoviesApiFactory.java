package com.example.finalproject.di;

import com.example.finalproject.data.network.api.MovieApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideMoviesApiFactory implements Factory<MovieApi> {
  @Override
  public MovieApi get() {
    return provideMoviesApi();
  }

  public static NetworkModule_ProvideMoviesApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MovieApi provideMoviesApi() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideMoviesApi());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideMoviesApiFactory INSTANCE = new NetworkModule_ProvideMoviesApiFactory();
  }
}
