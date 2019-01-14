package jp.co.rakuten.tech.rakutentv.network

import jp.co.rakuten.tech.rakutentv.Constants
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NetworkClientTest {

  private var networkClient: NetworkClient? = null

  @Test
  fun getRetrofitTestNotEquals() {
    networkClient = NetworkClient()
    NetworkClient.getRetrofit()
    assertNotEquals(NetworkClient.getRetrofit(), null)
  }

  @Test
  fun getRetrofitTestEquals() {
    networkClient = NetworkClient()
    val retrofit = NetworkClient.getRetrofit()
    val httpUrl = retrofit.baseUrl()
    assertEquals(Constants.BASE_URL, httpUrl.url().toString())
  }

}