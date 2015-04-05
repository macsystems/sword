package org.sword.module;

import android.app.Application;
import android.content.Context;

import org.sword.annotation.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationContextModule<T extends Application> {
    private final T app;

    public ApplicationContextModule(final T app) {
        this.app = app;
    }

    @ApplicationContext
    @Provides
    @Singleton
    T provideApplication() {
        return app;
    }

    @Singleton
    @Provides
    Context provideContext() {
        return app;
    }
}
