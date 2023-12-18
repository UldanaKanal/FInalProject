package com.example.finalproject.di;

import android.app.Application;
import com.example.finalproject.data.db.AppDataBase;
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
public final class DbModule_ProvideDbFactory implements Factory<AppDataBase> {
  private final Provider<Application> appProvider;

  public DbModule_ProvideDbFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public AppDataBase get() {
    return provideDb(appProvider.get());
  }

  public static DbModule_ProvideDbFactory create(Provider<Application> appProvider) {
    return new DbModule_ProvideDbFactory(appProvider);
  }

  public static AppDataBase provideDb(Application app) {
    return Preconditions.checkNotNullFromProvides(DbModule.INSTANCE.provideDb(app));
  }
}
