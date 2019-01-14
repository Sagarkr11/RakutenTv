package jp.co.rakuten.tech.rakutentv.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import jp.co.rakuten.tech.rakutentv.model.stream.Stream
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
open class StreamViewModelTest {

  lateinit var viewModel: StreamViewModel
  lateinit var result: LiveData<Stream>
  lateinit var resultMutable: MutableLiveData<Stream>

  @Before
  fun init() {
    MockitoAnnotations.initMocks(this)

    viewModel = mock(StreamViewModel::class.java)
    result = mock(LiveData::class.java) as LiveData<Stream>
    resultMutable = MutableLiveData()

  }

  @Test
  fun getStreamDetailEquals() {
    //`when`<LiveData<Stream>>(viewModel.getStreamDetail("MovieId")).thenReturn(result)
    Assert.assertEquals(viewModel.getStreamDetail("MovieId"), resultMutable)
  }

  @Test
  fun getStreamDetailNotEquals() {
    //`when`<LiveData<Stream>>(viewModel.getStreamDetail("MovieId")).thenReturn(result)
    Assert.assertNotEquals(viewModel.getStreamDetail("Movie"), result)
  }

}