package jp.co.rakuten.tech.rakutentv.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import jp.co.rakuten.tech.rakutentv.model.movie.Movie
import jp.co.rakuten.tech.rakutentv.network.ApiClient
import jp.co.rakuten.tech.rakutentv.network.NetworkClient

open class MovieRepo {

  private val movieRepo = MutableLiveData<Movie>()

  fun getMovieDetail(movieId: String): LiveData<Movie> {

    getObservable(movieId).subscribeWith(getObserver())

    return movieRepo
  }

  fun getObservable(movieId: String): Observable<Movie> {

    return NetworkClient.getRetrofit()
      .create(ApiClient::class.java)
      .getMovieDetail(movieId)
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
  }

  private fun getObserver(): DisposableObserver<Movie> {

    return object : DisposableObserver<Movie>() {

      override fun onNext(movie: Movie) {
        movieRepo.setValue(movie)
      }

      override fun onError(e: Throwable) {
      }

      override fun onComplete() {
      }

    }
  }
}