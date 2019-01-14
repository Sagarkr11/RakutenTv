package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ViewOptions {

  @SerializedName("errors")
  @Expose
  val errors: List<Errors>? = null

}