package eu.gitcode.githubrepos.app.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import eu.gitcode.githubrepos.app.App
import eu.gitcode.githubrepos.app.di.module.ApiModule
import eu.gitcode.githubrepos.app.di.module.AppModule
import eu.gitcode.githubrepos.app.di.module.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ApiModule::class,
        NetworkModule::class
    ]
)

interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<App>
}