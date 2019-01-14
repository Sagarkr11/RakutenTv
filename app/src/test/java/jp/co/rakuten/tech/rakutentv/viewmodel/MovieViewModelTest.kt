package jp.co.rakuten.tech.rakutentv.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import jp.co.rakuten.tech.rakutentv.model.movie.Movie
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class MovieViewModelTest {

  lateinit var viewModel: MovieViewModel
  lateinit var result: LiveData<Movie>
  lateinit var resultMutable: MutableLiveData<Movie>

  @Before
  fun init() {
    MockitoAnnotations.initMocks(this)

    viewModel = mock(MovieViewModel::class.java)
    result = mock(LiveData::class.java) as LiveData<Movie>

    resultMutable = MutableLiveData()

  }

  @Test
  fun getMovieDetailEquals() {
    //`when`(viewModel.getMovieDetail("MovieId")).theReturn(result)
    Assert.assertEquals(viewModel.getMovieDetail("MovieId"), resultMutable)
  }

  @Test
  fun getMovieDetailNotEquals() {
    //`when`(viewModel.getMovieDetail("MovieId")).theReturn(result)
    Assert.assertNotEquals(viewModel.getMovieDetail("Movie"), result)
  }

}