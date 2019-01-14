package jp.co.rakuten.tech.rakutentv.repository

import androidx.lifecycle.LiveData
import jp.co.rakuten.tech.rakutentv.model.movie.Movie
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import org.mockito.Mockito.`when`


@RunWith(JUnit4::class)
class MovieRepoTest {

  lateinit var movieRepo: MovieRepo
  lateinit var result: LiveData<Movie>

  @Before
  fun init() {
    MockitoAnnotations.initMocks(this)

    movieRepo = mock<MovieRepo>(MovieRepo::class.java)
    result = mock<LiveData<*>>(LiveData::class.java) as LiveData<Movie>

  }

  @Test
  fun getMovieDetailEquals() {
    //`when`<LiveData<Movie>>(movieRepo.getMovieDetail("MovieId")).thenReturn(result)
    Assert.assertEquals(movieRepo.getMovieDetail("MovieId"), null)
  }

  @Test
  fun getMovieDetailNotEquals() {
    //`when`<LiveData<Movie>>(movieRepo.getMovieDetail("MovieId")).thenReturn(result)
    Assert.assertNotEquals(movieRepo.getMovieDetail("Movie"), result)
  }

}