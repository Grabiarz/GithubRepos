package eu.gitcode.githubrepos.app

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import eu.gitcode.githubrepos.app.di.DaggerAppComponent
import io.reactivex.plugins.RxJavaPlugins

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }

    override fun onCreate() {
        super.onCreate()
        RxJavaPlugins.setErrorHandler(RxJavaErrorHandler())
    }
}