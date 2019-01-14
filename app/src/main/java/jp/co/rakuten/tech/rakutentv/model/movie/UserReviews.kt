package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserReviews {

  @SerializedName("meta")
  @Expose
  val meta: MetaCritic? = null

  @SerializedName("data")
  @Expose
  val data: List<DataCritic>? = null

}