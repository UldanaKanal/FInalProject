// Generated by Dagger (https://dagger.dev).
package com.example.finalproject.presentation.screen.search;

import com.example.finalproject.presentation.image_loader.ImageLoader;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
        "unchecked",
        "rawtypes"
})
public final class SearchFragment_MembersInjector implements MembersInjector<SearchFragment> {
  private final Provider<ImageLoader> imageLoaderProvider;

  public SearchFragment_MembersInjector(Provider<ImageLoader> imageLoaderProvider) {
    this.imageLoaderProvider = imageLoaderProvider;
  }

  public static MembersInjector<SearchFragment> create(Provider<ImageLoader> imageLoaderProvider) {
    return new SearchFragment_MembersInjector(imageLoaderProvider);
  }

  @Override
  public void injectMembers(SearchFragment instance) {
    injectImageLoader(instance, imageLoaderProvider.get());
  }

  @InjectedFieldSignature("com.example.finalproject.presentation.screen.search.SearchFragment.imageLoader")
  public static void injectImageLoader(SearchFragment instance, ImageLoader imageLoader) {
    instance.imageLoader = imageLoader;
  }
}
