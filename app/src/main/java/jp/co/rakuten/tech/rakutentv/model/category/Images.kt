package jp.co.rakuten.tech.rakutentv.model.category

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Images {

  @SerializedName("artwork")
  @Expose
  val artwork: String? = null

  @SerializedName("snapshot")
  @Expose
  val snapshot: String? = null

  @SerializedName("ribbons")
  @Expose
  val ribbons: List<Ribbon>? = null

}