package jp.co.rakuten.tech.rakutentv.model.movie

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Countries {

  @SerializedName("type")
  @Expose
  val type: String? = null

  @SerializedName("id")
  @Expose
  val id: String? = null

  @SerializedName("numerical_id")
  @Expose
  val numericalId: Int = 0

  @SerializedName("name")
  @Expose
  val name: String? = null

}