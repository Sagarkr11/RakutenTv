package jp.co.rakuten.tech.rakutentv.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import jp.co.rakuten.tech.rakutentv.model.stream.Stream
import jp.co.rakuten.tech.rakutentv.repository.StreamRepo

open class StreamViewModel : ViewModel() {

  fun getStreamDetail(movieId: String): LiveData<Stream> {
    return StreamRepo().getStreamDetail(movieId)
  }
}