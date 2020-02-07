package eu.gitcode.githubrepos.network

import eu.gitcode.githubrepos.data.github.model.ReposSummaryRest
import io.reactivex.Single
import retrofit2.http.POST
import retrofit2.http.Query

internal interface GithubApi {
    @POST("search/repositories")
    fun getBestRepos(
        @Query("q") keyword: String, @Query("page") page: Int,
        @Query("per_page") perPage: Int = DEFAULT_PAGE_SIZE,
        @Query("sort") sortType: String = "stars"
    ): Single<ReposSummaryRest>

    companion object {
        private const val DEFAULT_PAGE_SIZE = 10
    }
}