package eu.gitcode.githubrepos.app.di.module

import dagger.Module
import dagger.Provides
import eu.gitcode.githubrepos.network.GithubApi
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
internal class ApiModule {

    @Singleton
    @Provides
    fun provideGithubApi(retrofit: Retrofit): GithubApi =
        retrofit.create()
}