package com.example.finalproject.di;

import com.example.finalproject.presentation.image_loader.ImageLoader;
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
public final class ImageModule_ProvideImageLoaderFactory implements Factory<ImageLoader> {
  @Override
  public ImageLoader get() {
    return provideImageLoader();
  }

  public static ImageModule_ProvideImageLoaderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ImageLoader provideImageLoader() {
    return Preconditions.checkNotNullFromProvides(ImageModule.INSTANCE.provideImageLoader());
  }

  private static final class InstanceHolder {
    private static final ImageModule_ProvideImageLoaderFactory INSTANCE = new ImageModule_ProvideImageLoaderFactory();
  }
}
