package jp.co.rakuten.tech.rakutentv.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import jp.co.rakuten.tech.rakutentv.model.movie.Movie
import jp.co.rakuten.tech.rakutentv.repository.MovieRepo

open class MovieViewModel : ViewModel() {

  fun getMovieDetail(movieId: String): LiveData<Movie> {
    return MovieRepo().getMovieDetail(movieId)
  }
}