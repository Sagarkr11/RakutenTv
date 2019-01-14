package jp.co.rakuten.tech.rakutentv.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import jp.co.rakuten.tech.rakutentv.model.stream.Stream
import jp.co.rakuten.tech.rakutentv.network.ApiClient
import jp.co.rakuten.tech.rakutentv.network.NetworkClient

open class StreamRepo {

  private val streamRepo = MutableLiveData<Stream>()

  fun getStreamDetail(movieId: String): LiveData<Stream> {

    getObservable(movieId).subscribeWith(getObserver())

    return streamRepo
  }

  fun getObservable(movieId: String): Observable<Stream> {

    return NetworkClient.getRetrofit()
      .create(ApiClient::class.java)
      .getStreamDetail(movieId)
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
  }

  private fun getObserver(): DisposableObserver<Stream> {

    return object : DisposableObserver<Stream>() {

      override fun onNext(stream: Stream) {
        streamRepo.setValue(stream)
      }

      override fun onError(e: Throwable) {
      }

      override fun onComplete() {
      }

    }
  }
}