package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Errors {

  @SerializedName("field")
  @Expose
  val field: String? = null

  @SerializedName("code")
  @Expose
  val code: String? = null

  @SerializedName("message")
  @Expose
  val message: String? = null

}