package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Movie {

  @SerializedName("meta")
  @Expose
  val meta: MetaMain? = null

  @SerializedName("data")
  @Expose
  val data: Data? = null

}