package jp.co.rakuten.tech.rakutentv.network

import io.reactivex.Observable
import jp.co.rakuten.tech.rakutentv.model.category.Category
import jp.co.rakuten.tech.rakutentv.model.movie.Movie
import jp.co.rakuten.tech.rakutentv.model.stream.Stream
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiClient {

  @GET("lists/{categoryname}?classification_id=6&device_identifier=android&locale=es&market_code" + "=es")
  abstract fun getCategoryDetail(@Path("categoryname") categoryName: String): Observable<Category>

  @GET("movies/{movieid}?classification_id=6&device_identifier=android&locale=es&market_code=es")
  abstract fun getMovieDetail(@Path("movieid") movieId: String): Observable<Movie>

  @POST("me/streamings?content_type=movies&device_serial=device_serial_1&device_stream_video_quality=FHD&player=android:PD-NONE&subtitle_language=MIS&video_type=trailer&classification_id=6&device_identifier=android&locale=es&market_code=es&audio_quality=2.0&audio_language=SPA")
  abstract fun getStreamDetail(@Query("content_id") movieId: String): Observable<Stream>

}