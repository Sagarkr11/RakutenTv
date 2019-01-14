package jp.co.rakuten.tech.rakutentv.network

import jp.co.rakuten.tech.rakutentv.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class NetworkClient {

  companion object {

    fun getRetrofit(): Retrofit {

      var retrofit: Retrofit? = null

      if (retrofit == null) {

        val builder = OkHttpClient.Builder()
        val okHttpClient = builder.build()

        retrofit = Retrofit.Builder()
          .baseUrl(Constants.BASE_URL)
          .addConverterFactory(GsonConverterFactory.create())
          .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
          .client(okHttpClient)
          .build()

      }

      return retrofit!!
    }
  }

}