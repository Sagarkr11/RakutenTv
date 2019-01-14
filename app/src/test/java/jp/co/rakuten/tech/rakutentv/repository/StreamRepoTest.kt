package jp.co.rakuten.tech.rakutentv.repository

import androidx.lifecycle.LiveData
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
class StreamRepoTest {

  lateinit var streamRepo: StreamRepo
  lateinit var result: LiveData<Stream>

  @Before
  fun init() {
    MockitoAnnotations.initMocks(this)

    streamRepo = mock<StreamRepo>(StreamRepo::class.java)
    result = mock<LiveData<*>>(LiveData::class.java) as LiveData<Stream>

  }

  @Test
  fun getStreamDetailEquals() {
    //`when`<LiveData<Stream>>(streamRepo.getStreamDetail("MovieId")).thenReturn(result)
    Assert.assertEquals(streamRepo.getStreamDetail("MovieId"), null)
  }

  @Test
  fun getStreamDetailNotEquals() {
    //`when`<LiveData<Stream>>(streamRepo.getStreamDetail("MovieId")).thenReturn(result)
    Assert.assertNotEquals(streamRepo.getStreamDetail("Movie"), result)
  }

}