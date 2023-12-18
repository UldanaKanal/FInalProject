package com.example.finalproject.presentation

import androidx.activity.contextaware.OnContextAvailableListener
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories
import dagger.hilt.android.internal.managers.ActivityComponentManager
import dagger.hilt.internal.GeneratedComponentManagerHolder
import dagger.hilt.internal.UnsafeCasts

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
abstract class Hilt_MainActivity : AppCompatActivity, GeneratedComponentManagerHolder {
    @Volatile
    private var componentManager: ActivityComponentManager? = null
    private val componentManagerLock = Any()
    private var injected = false

    internal constructor() : super() {
        _initHiltInternal()
    }

    internal constructor(contentLayoutId: Int) : super(contentLayoutId) {
        _initHiltInternal()
    }

    private fun _initHiltInternal() {
        addOnContextAvailableListener(OnContextAvailableListener { inject() })
    }

    fun generatedComponent(): Any {
        return componentManager().generatedComponent()
    }

    protected fun createComponentManager(): ActivityComponentManager {
        return ActivityComponentManager(this)
    }

    fun componentManager(): ActivityComponentManager? {
        if (componentManager == null) {
            synchronized(componentManagerLock) {
                if (componentManager == null) {
                    componentManager = createComponentManager()
                }
            }
        }
        return componentManager
    }

    protected fun inject() {
        if (!injected) {
            injected = true
            (generatedComponent() as MainActivity_GeneratedInjector).injectMainActivity(UnsafeCasts.< MainActivity > unsafeCast < MainActivity ? > this)
        }
    }

    val defaultViewModelProviderFactory: Factory
        get() = DefaultViewModelFactories.getActivityFactory(
            this,
            super.getDefaultViewModelProviderFactory()
        )
}